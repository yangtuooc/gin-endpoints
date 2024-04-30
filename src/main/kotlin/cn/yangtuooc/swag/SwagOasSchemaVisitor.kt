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

import com.goide.psi.*
import com.goide.psi.impl.GoTypeUtil
import com.intellij.microservices.oas.OasProperty
import com.intellij.microservices.oas.OasSchema
import com.intellij.microservices.oas.OasSchemaType

private const val JSON_TAG = "json"

/**
 * @author yangtuo
 */
class SwagOasSchemaVisitor : GoRecursiveVisitor() {

    private val properties = mutableListOf<OasProperty>()

    fun schema(): OasSchema {
        return OasSchema(
            type = OasSchemaType.OBJECT,
            properties = properties
        )
    }

    override fun visitAnonymousFieldDefinition(o: GoAnonymousFieldDefinition) {
        o.typeReferenceExpression?.let {
            it.resolve()?.let { typeSpec ->
                val visitor = SwagOasSchemaVisitor()
                typeSpec.accept(visitor)
                properties.addAll(visitor.properties)
            }
        }
    }

    override fun visitFieldDeclaration(o: GoFieldDeclaration) {
        if (isAnonymous(o)) {
            visitAnonymousFieldDefinition(o.anonymousFieldDefinition!!)
            return
        }
        if (isDash(o)) {
            return
        }
        val name = resolveName(o)
        val property = OasProperty(
            name = name,
            schema = OasSchema(
                type = resolveSchemaType(o.rawType!!),
                required = if (isRequired(o)) listOf(name) else null
            )
        )
        properties.add(property)
    }

    private fun isAnonymous(o: GoFieldDeclaration): Boolean {
        return o.anonymousFieldDefinition != null
    }

    private fun isDash(o: GoFieldDeclaration): Boolean {
        return o.tag?.getValue(JSON_TAG)?.contains("-") ?: false
    }

    private fun isRequired(o: GoFieldDeclaration): Boolean {
        var required = true
        o.tag?.getValue(JSON_TAG)?.let {
            required = !it.contains("omitempty")
        }
        return required
    }

    private fun resolveName(o: GoFieldDeclaration): String {
        var name = o.fieldDefinitionList.first().name
        o.tag?.getValue(JSON_TAG)?.let {
            name = it.split(',')[0]
        }
        return name ?: ""
    }

    /**
     * TODO: 完善其他类型的解析
     * FIXME: time.Time 类型暂时不确定如何解析
     */
    private fun resolveSchemaType(type: GoType): OasSchemaType {
        return when {
            GoTypeUtil.isIntType(type, type.context) -> OasSchemaType.INTEGER
            GoTypeUtil.isString(type, type.context) -> OasSchemaType.STRING
            GoTypeUtil.isUintType(type, type.context) -> OasSchemaType.INTEGER
            GoTypeUtil.isFloatType(type, type.context) -> OasSchemaType.NUMBER
            GoTypeUtil.isPointer(type, type.context) -> resolveSchemaType((type as GoPointerType).rawType!!)
            else -> OasSchemaType.STRING
        }
    }
}