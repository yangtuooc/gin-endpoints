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
import com.goide.stubs.index.GoTypesIndex
import com.intellij.microservices.oas.OasComponents
import com.intellij.microservices.oas.OasSchema
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.GlobalSearchScopes

/**
 * @author yangtuo
 */
class SwagReferenceResolver(val group: GoFile, private val endpoint: GinUrlData) {

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
        val typeSpec = GoTypesIndex.find(reference, group.project, searchScope(endpoint), null).first()
        val visitor = SwagOasSchemaVisitor()
        typeSpec.accept(visitor)
        return visitor.schema()
    }

    private fun searchScope(endpoint: GinUrlData): GlobalSearchScope {
        val searchDirectory = endpoint.getDocumentationPsiElement()!!.containingFile.containingDirectory
        return GlobalSearchScopes.directoryScope(searchDirectory, true)
    }
}