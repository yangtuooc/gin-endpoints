/*
 * Copyright (c) 2023 yangtuooc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package cn.yangtuooc.swag

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.goide.psi.GoImportSpec
import com.goide.psi.GoTypeSpec
import com.goide.sdk.GoPackageUtil
import com.goide.stubs.index.GoTypesIndex
import com.intellij.microservices.oas.OasComponents
import com.intellij.microservices.oas.OasSchema
import com.intellij.psi.ResolveState
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.GlobalSearchScopes

/**
 * @author yangtuo
 */
class SwagReferenceResolver(val group: GoFile, private val endpoint: GinUrlData) {

    private val element = endpoint.getDocumentationPsiElement()!!
    fun resolve(references: Set<String>): OasComponents? {
        if (references.isEmpty()) {
            return null
        }
        val schemas = mutableMapOf<String, OasSchema>()
        for (reference in references) {
            schemas[reference] = processReference(reference)
        }
        return OasComponents(schemas)
    }

    private fun processReference(reference: String): OasSchema {
        val typeSpec = findTypeSpec(reference)
        val visitor = SwagOasSchemaVisitor()
        typeSpec.accept(visitor)
        return visitor.schema()
    }

    private fun currentDirectoryScope(): GlobalSearchScope {
        val searchDirectory = element.containingFile.containingDirectory
        return GlobalSearchScopes.directoryScope(searchDirectory, true)
    }

    private fun findTypeSpec(reference: String): GoTypeSpec {
        if (reference.split(".").size == 1) {
            return GoTypesIndex.find(reference, group.project, currentDirectoryScope(), null).first()
        }
        val (packageName, typeName) = reference.split(".")
        val import = findImport(packageName)
        if (import != null) {
            val packages = GoPackageUtil.findByImportPath(import.path, group.project, null, ResolveState.initial())
            val searchScope = GoPackageUtil.packagesScope(packages)
            return GoTypesIndex.find(typeName, group.project, searchScope, null).first()
        }
        throw IllegalArgumentException("Cannot find type spec for reference: $reference")
    }

    private fun findImport(packageName: String): GoImportSpec? {
        (element.containingFile as GoFile).imports.forEach {
            if (it.alias == packageName || it.path.endsWith(packageName)) {
                return it
            }
        }
        return null
    }
}