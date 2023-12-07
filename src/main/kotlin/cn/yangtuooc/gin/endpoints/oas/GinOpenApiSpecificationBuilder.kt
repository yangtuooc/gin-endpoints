package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.GinUrlMappingElement
import cn.yangtuooc.gin.handlerFunc.GinHandlerFunc
import cn.yangtuooc.gin.handlerFunc.GinHandlerFuncImpl
import cn.yangtuooc.gin.handlerFunc.GinParameter
import cn.yangtuooc.gin.handlerFunc.ParameterType
import com.intellij.microservices.mime.MimeTypes.APPLICATION_JSON
import com.intellij.microservices.oas.*
import com.intellij.microservices.url.UrlTargetInfo
import kotlin.jvm.internal.Intrinsics

class GinOpenApiSpecificationBuilder(
    private val endpoint: GinUrlMappingElement,
    private val urlTargetInfo: UrlTargetInfo
) {

    private val handlerFunc: GinHandlerFunc = GinHandlerFuncImpl(endpoint, urlTargetInfo)

    fun build(): OpenApiSpecification {
        return OpenApiSpecification(buildPaths(), buildComponents(), buildTags())
    }

    private fun buildTags(): List<OasTag> {
        return emptyList()
    }

    private fun buildComponents(): OasComponents {
        val schema = OasSchema(
            type = OasSchemaType.OBJECT,
            properties = listOf(
                OasProperty(
                    name = "code",
                    schema = OasSchema(
                        type = OasSchemaType.STRING
                    )
                )
            )
        )
        return OasComponents(mutableMapOf("Message" to schema))
    }

    private fun buildPaths(): Collection<OasEndpointPath> {
        val endpointPath = OasEndpointPath(endpoint.getURL(), null, buildOperations())
        return listOf(endpointPath)
    }

    private fun buildOperations(): Collection<OasOperation> {
        val operations = mutableListOf<OasOperation>()
        endpoint.getMethod().forEach { method ->
            val operation =
                OasOperation(
                    method = OasHttpMethod.valueOf(method.name),
                    tags = listOf(),
                    description = handlerFunc.getDescription() ?: handlerFunc.getHandlerFuncComment(),
                    summary = handlerFunc.getHandlerFuncComment(),
                    operationId = handlerFunc.getName(),
                    isDeprecated = handlerFunc.isDeprecated(),
                    parameters = buildParameters(),
                    requestBody = buildRequestBody(),
                    responses = buildResponses()
                )
            operations.add(operation)
        }
        return operations
    }

    private fun buildResponses(): Collection<OasResponse> {
        return emptyList()
    }

    private fun buildRequestBody(): OasRequestBody {
        val oasSchema = OasSchema(
            reference = Intrinsics.stringPlus("#/components/schemas/", "Message")
        )
        return OasRequestBody(mutableMapOf(APPLICATION_JSON to oasSchema), false)
    }

    private fun buildParameters(): Collection<OasParameter> {

        val payload = handlerFunc.getPayload() ?: return emptyList()
        val parameters = payload.getParameters()
        return parameters.map { parameter ->
            OasParameter(
                name = parameter.getName(),
                description = parameter.getDescription(),
                inPlace = OasParameterIn.valueOf(parameter.getIn()),
                isDeprecated = parameter.getDeprecated(),
                isRequired = parameter.getRequired(),
                schema = buildSchema(parameter),
                style = buildStyle(parameter)
            )
        }
    }

    private fun buildStyle(parameter: GinParameter): OasParameterStyle? {
        return null
    }

    private fun buildSchema(parameter: GinParameter): OasSchema {
        return OasSchema(
            type = parameter.getType().oasType,
            format = null,
            default = parameter.getDefaultValue(),
            items = buildSchemaItems(parameter),
            properties = buildProperties(parameter),
            reference = null,
            enum = null,
            required = null
        )
    }

    private fun buildProperties(parameter: GinParameter): List<OasProperty>? {
        return null
    }

    private fun buildSchemaItems(parameter: GinParameter): OasSchema? {
        if (ParameterType.ARRAY == parameter.getType()) {
            return buildSchema(parameter)
        }
        return null
    }


}
