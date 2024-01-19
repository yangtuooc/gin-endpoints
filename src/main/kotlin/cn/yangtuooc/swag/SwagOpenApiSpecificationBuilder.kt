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
import cn.yangtuooc.swag.specifications.api.ParamDataType
import cn.yangtuooc.swag.specifications.api.Response
import com.goide.psi.GoFile
import com.intellij.microservices.oas.*

/**
 * @author yangtuo
 */
class SwagOpenApiSpecificationBuilder(
    group: GoFile,
    endpoint: GinUrlData,
    private val swag: Swag
) {
    private val referenceResolver = SwagReferenceResolver(group, endpoint)

    fun build(): OpenApiSpecification {
        return OpenApiSpecification(
            paths = buildPaths(),
            components = buildComponents(),
            tags = buildTags(),
        )
    }

    private fun buildTags(): List<OasTag> {
        return listOf(OasTag(swag.tagName(), swag.tagDescription()))
    }

    private fun buildComponents(): OasComponents? {
        return referenceResolver.resolve(swag.references())
    }

    private fun buildPaths(): Collection<OasEndpointPath> {
        if (swag.router == null) {
            return emptyList()
        }
        return listOf(
            OasEndpointPath(
                path = swag.path(),
                summary = null,
                operations = buildOperations()
            )
        )
    }

    private fun buildOperations(): Collection<OasOperation> {
        return listOf(
            OasOperation(
                method = swag.method().toOasHttpMethod(),
                tags = swag.tags(),
                description = swag.description(),
                summary = swag.summary(),
                operationId = swag.id(),
                isDeprecated = swag.deprecated(),
                parameters = buildParameters(),
                requestBody = buildRequestBody(),
                responses = buildResponses(),
            )
        )
    }

    private fun buildResponses(): Collection<OasResponse> {
        val responses = mutableListOf<OasResponse>()
        swag.successes.forEach { success ->
            responses.add(
                OasResponse(
                    code = success.code(),
                    description = success.comment(),
                    content = buildContent(success)
                )
            )
            swag.failures.forEach { failure ->
                responses.add(
                    OasResponse(
                        code = failure.code(),
                        description = failure.comment(),
                        content = buildContent(failure)
                    )
                )
            }
            swag.responses.forEach { response ->
                responses.add(
                    OasResponse(
                        code = response.code(),
                        description = response.comment(),
                        content = buildContent(response)
                    )
                )
            }
            swag.headers.forEach { header ->
                responses.add(
                    OasResponse(
                        code = header.code(),
                        description = header.comment(),
                        content = buildContent(header)
                    )
                )
            }
        }
        return responses
    }

    private fun buildContent(response: Response): Map<String, OasMediaTypeObject> {
        val produce = swag.produce ?: return emptyMap()
        val content = mutableMapOf<String, OasMediaTypeObject>()
        if (response.paramType()?.isReference() == true) {
            val schema = buildReferenceSchema(response)
            content[produce.toString()] = OasMediaTypeObject(schema, emptyMap())
        }
        return content
    }

    private fun buildReferenceSchema(response: Response): OasSchema {
        val dataType = response.dataType()
        return OasSchema(
            type = response.paramType()?.toOasSchemaType(),
            reference = "#/components/schemas/$dataType"
        )
    }


    private fun buildRequestBody(): OasRequestBody? {
        val body = swag.requestBody() ?: return null
        val content = mutableMapOf<String, OasSchema>()
        val schema = OasSchema(
            type = OasSchemaType.OBJECT,
            reference = "#/components/schemas/${body.dataType}"
        )
        content[body.name] = schema
        return OasRequestBody(
            content = content,
            required = body.required
        )
    }

    private fun buildParameters(): Collection<OasParameter> {
        val parameters = mutableListOf<OasParameter>()
        swag.parameters().forEach { param ->
            if (ParamDataType.isAllowed(param.dataType)) {
                parameters.add(
                    OasParameter(
                        name = param.name,
                        inPlace = param.paramIn.toOasParameterIn(),
                        description = param.comment,
                        isRequired = param.required,
                        isDeprecated = param.deprecated(),
                        schema = OasSchema(
                            type = ParamDataType.from(param.dataType).toOasSchemaType(),
                        ),
                        style = null,
                    )
                )
            }
        }
        return parameters
    }
}