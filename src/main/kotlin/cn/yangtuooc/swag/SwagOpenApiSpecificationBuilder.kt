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
import cn.yangtuooc.swag.specifications.api.Success
import com.goide.psi.GoFile
import com.intellij.microservices.oas.*

/**
 * @author yangtuo
 */
class SwagOpenApiSpecificationBuilder(
    private val group: GoFile,
    private val endpoint: GinUrlData,
    private val swag: Swag
) {

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
        return null
    }

    private fun buildPaths(): Collection<OasEndpointPath> {
        if (swag.router == null) {
            return emptyList()
        }
        return listOf(
            OasEndpointPath(
                path = swag.path(),
                summary = swag.summary(),
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
        swag.successes.forEach {
            responses.add(
                OasResponse(
                    code = it.code(),
                    description = it.comment(),
                    content = buildContent()
                )
            )

        }
        return responses
    }

    private fun buildContent(): Map<String, OasMediaTypeObject> {
        val produce = swag.produce ?: return emptyMap()
        val content = mutableMapOf<String, OasMediaTypeObject>()
        for (success in swag.successes) {
            if (success.paramType().isReference()) {
                val schema = buildReferenceSchema(success)
                content[produce.toString()] = OasMediaTypeObject(schema, emptyMap())
            }
        }
        return content
    }

    private fun buildReferenceSchema(success: Success): OasSchema {
        val dataType = success.dataType()
        return OasSchema(
            type = success.paramType().toOasSchemaType(),
            reference = "#/components/schemas/$dataType"
        )
    }


    private fun buildRequestBody(): OasRequestBody? {
        return null
    }

    private fun buildParameters(): Collection<OasParameter> {
        return emptyList()
    }
}