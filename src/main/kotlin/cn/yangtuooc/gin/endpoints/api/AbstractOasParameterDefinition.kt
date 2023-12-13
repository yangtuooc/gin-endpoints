package cn.yangtuooc.gin.endpoints.api

import com.intellij.microservices.oas.OasParameterIn
import com.intellij.microservices.oas.OasParameterStyle
import com.intellij.microservices.oas.OasSchemaFormat
import com.intellij.microservices.oas.OasSchemaType

interface AbstractOasParameterDefinition {
    val summary: String?
    val properties: List<AbstractOasProperty>
    val requiredProperties: List<String>?
    val enumValues: List<String>?
    val reference: OasReference?
    val items: AbstractOasParameterDefinition
    val name: String
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
    val vendorExtensions: Map<String, Any>
    val examples: Map<String, AbstractOasParameterDefinition>
}

interface AbstractOasParameter : AbstractOasParameterDefinition {
    val inPlace: OasParameterIn
}

interface AbstractOasProperty {
    val name: String
    val schema: AbstractOasParameterDefinition
}

data class OasReference(val reference: String) {
    override fun toString(): String {
        return "#/components/schemas/$reference"
    }
}

interface AbstractOasRequestBody : AbstractOasParameterDefinition {
    val content: Map<String, AbstractOasParameterDefinition>
}

interface AbstractOasResponse : AbstractOasParameterDefinition {

    val headers: List<AbstractOasParameterDefinition>
        get() = emptyList()

    val content: Map<String, AbstractOasParameterDefinition>
        get() = emptyMap()

    val code: String
}