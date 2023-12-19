package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.GinHandlerFuncImpl
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasHttpMethod
import com.intellij.microservices.oas.OasOperation

/**
 * @author yangtuo
 */
class GinOasOperationConverter(group: GoFile, private val endpoint: GinUrlData) :
    OpenApiSpecificationConverter<Map<OasHttpMethod, OasOperation>> {

    internal val parameterConverter = GinParameterConverter(group, endpoint)
    private val requestBodyConverter = GinRequestBodyConverter(group, endpoint)
    private val responsesConverter = GinResponsesConverter(group, endpoint)
    private val handlerFunc = GinHandlerFuncImpl(endpoint)

    override fun convert(): Map<OasHttpMethod, OasOperation> {
        return endpoint.getHttpMethod().associate { method ->
            val oasMethod = OasHttpMethod.valueOf(method)
            val oasOperation = OasOperation(
                method = oasMethod,
                tags = emptyList(),
                description = handlerFunc.description(),
                summary = handlerFunc.summary(),
                operationId = handlerFunc.name(),
                isDeprecated = handlerFunc.isDeprecated(),
                parameters = parameterConverter.convert(),
                requestBody = requestBodyConverter.convert(),
                responses = responsesConverter.convert()
            )

            oasMethod to oasOperation
        }
    }
}