package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameter
import cn.yangtuooc.gin.endpoints.api.AbstractOasResponse
import cn.yangtuooc.gin.endpoints.api.GinApiResolver
import com.goide.psi.GoFile
import com.intellij.microservices.oas.*

/**
 * @author yangtuo
 */
class GinOpenApiSpecificationBuilder(
    group: GoFile,
    private val endpoint: GinUrlData
) {
    private val handlerFunc = GinApiResolver(group, endpoint).resolve()

    fun build(): OpenApiSpecification {
        return buildOpenApiSpecification()
    }

    private fun buildOpenApiSpecification(): OpenApiSpecification {
        return OpenApiSpecification(
            paths = buildPaths(),
            components = buildComponents(),
            tags = buildTags()
        )
    }

    private fun buildTags(): List<OasTag> {
        // TODO
        return emptyList()
    }

    private fun buildComponents(): OasComponents {
        return OasComponents(
            handlerFunc.getComponents()
                .mapValues { entry -> buildOasSchema(entry.value) }
        )
    }

    private fun buildPaths(): Collection<OasEndpointPath> {

        val operations = endpoint.getHttpMethod()
            .map { httpMethod ->
                OasOperation(
                    method = OasHttpMethod.valueOf(httpMethod),
                    tags = handlerFunc.getTags(),
                    description = handlerFunc.getDescription(),
                    summary = handlerFunc.getSummary(),
                    operationId = handlerFunc.getOperationId(),
                    isDeprecated = handlerFunc.isDeprecated(),
                    parameters = buildOasParameters(),
                    requestBody = buildOasRequestBody(),
                    responses = buildOasResponses()
                )
            }.toList()

        val builder = OasEndpointPath.Builder(endpoint.getUrl() ?: "")
        builder.summary = handlerFunc.getSummary()
        builder.operations = operations

        return listOf(builder.build())
    }

    private fun buildOasResponses(): Collection<OasResponse> {
        val responses = handlerFunc.getResponses()
        return responses.map { response ->
            OasResponse(
                code = response.code,
                description = response.description,
                content = buildResponseContent(response),
                headers = buildOasHeaders(response)
            )
        }.toList()

    }

    private fun buildOasHeaders(response: AbstractOasResponse): List<OasHeader> {
        return response.headers.map { header ->
            OasHeader(
                name = header.name,
                required = header.required,
                schema = buildOasSchema(header)
            )
        }.toList()
    }

    private fun buildResponseContent(response: AbstractOasResponse): Map<String, OasMediaTypeObject> {
        return response.content.mapValues { entry ->
            OasMediaTypeObject(
                schema = buildOasSchema(entry.value),
                examples = buildOasExamples(entry.value)
            )
        }
    }

    private fun buildOasExamples(value: AbstractOasParameter): Map<String, OasExample> {
        return value.examples.mapValues { entry ->
            OasExample(
                summary = entry.value.summary,
                description = entry.value.description,
                value = buildOasExampleValue(entry.value),
            )
        }
    }

    private fun buildOasExampleValue(value: AbstractOasParameter): OasExampleValue {
        // TODO
        return OasNullValue
    }


    private fun buildOasParameters(): Collection<OasParameter> {
        val parameters = handlerFunc.getParameters()
        return parameters.map { param ->
            OasParameter(
                name = param.name,
                inPlace = param.inPlace,
                description = param.description,
                isRequired = param.required,
                isDeprecated = param.deprecated,
                schema = buildOasSchema(param),
                style = param.style,
            )
        }.toList()
    }

    private fun buildOasSchema(param: AbstractOasParameter): OasSchema {
        return OasSchema(
            type = param.type,
            format = param.format,
            default = param.defaultValue,
            items = buildOasSchema(param.items),
            properties = buildOasProperties(param),
            reference = param.reference?.toString(),
            enum = param.enumValues,
            required = param.requiredProperties,
        )
    }

    private fun buildOasProperties(param: AbstractOasParameter): List<OasProperty> {
        return param.properties.map { property ->
            OasProperty(
                name = property.name,
                schema = buildOasSchema(property.schema)
            )
        }.toList()
    }

    private fun buildOasRequestBody(): OasRequestBody {
        return OasRequestBody(
            content = buildOasContent(),
            required = handlerFunc.getRequestBody()?.required ?: false
        )
    }

    private fun buildOasContent(): Map<String, OasSchema> {
        val requestBody = handlerFunc.getRequestBody()
        return requestBody?.content?.mapValues { entry ->
            buildOasSchema(entry.value)
        } ?: emptyMap()
    }
}