package cn.yangtuooc.gin.endpoints.api

import com.intellij.microservices.oas.OasParameterIn
import com.intellij.microservices.oas.OasParameterStyle
import com.intellij.microservices.oas.OasSchemaFormat
import com.intellij.microservices.oas.OasSchemaType

interface AbstractOasParameter {
    val summary: String?
    val properties: List<AbstractOasProperty>
    val requiredProperties: List<String>?
    val enumValues: List<String>?
    val reference: OasReference?
    val items: AbstractOasParameter
    val name: String
    val inPlace: OasParameterIn
    val type: OasSchemaType
    val format: OasSchemaFormat?
    val style: OasParameterStyle?
    val description: String
    val required: Boolean
    val deprecated: Boolean
    val allowEmptyValue: Boolean
    val example: String
    val defaultValue: String

    val allowableValues: List<String>
        get() = emptyList()

    val vendorExtensions: Map<String, Any>
        get() = emptyMap()

    val examples: Map<String, AbstractOasParameter>
        get() = emptyMap()
}

interface AbstractOasProperty {
    val name: String
    val schema: AbstractOasParameter
}

data class OasReference(val reference: String) {
    override fun toString(): String {
        return "#/components/$reference"
    }
}

interface AbstractOasRequestBody : AbstractOasParameter {
    val content: Map<String, AbstractOasParameter>
}

interface AbstractOasResponse : AbstractOasParameter {

    val headers: List<AbstractOasParameter>
        get() = emptyList()

    val content: Map<String, AbstractOasParameter>
        get() = emptyMap()

    val code: String
}