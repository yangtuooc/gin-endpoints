package cn.yangtuooc.gin.endpoints.api

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.resolver.*
import com.goide.psi.GoFile
import com.goide.psi.GoFunctionLit
import com.goide.psi.GoMethodDeclaration

/**
 * @author yangtuo
 */
class GinHandlerFuncImpl(
    private val group: GoFile,
    private val endpoint: GinUrlData
) : GinHandlerFunc {

    private val parameterResolver: GinResolver<List<AbstractOasParameter>> =
        GinParameterResolver(group, endpoint)

    private val requestBodyResolver: GinResolver<AbstractOasRequestBody?> =
        GinRequestBodyResolver(group, endpoint)

    private val responsesResolver: GinResolver<List<AbstractOasResponse>> =
        GinResponsesResolver(group, endpoint)

    private val responseHeadersResolver: GinResolver<List<AbstractOasParameterDefinition>> =
        GinHeadersResolver(group, endpoint)

    private val componentsResolver: GinResolver<Map<String, AbstractOasParameterDefinition>> =
        GinComponentsResolver(group, endpoint)

    private val cookieParamsResolver: GinResolver<List<AbstractOasParameterDefinition>> =
        GinCookieParamsResolver(group, endpoint)

    override fun getParameters(): List<AbstractOasParameter> {
        return parameterResolver.resolve()
    }

    override fun getRequestBody(): AbstractOasRequestBody? {
        return requestBodyResolver.resolve()
    }

    override fun getResponseHeaders(): List<AbstractOasParameterDefinition> {
        return responseHeadersResolver.resolve()
    }

    override fun getCookieParams(): List<AbstractOasParameterDefinition> {
        return cookieParamsResolver.resolve()
    }

    override fun getResponses(): List<AbstractOasResponse> {
        return responsesResolver.resolve()
    }


    override fun getSummary(): String? {
        return null
    }

    override fun getTags(): List<String> {
        return emptyList()
    }

    override fun getDescription(): String? {
        return null
    }

    override fun getOperationId(): String? {
        return when (val element = endpoint.getDocumentationPsiElement()) {
            is GoMethodDeclaration -> element.name
            is GoFunctionLit -> TODO()
            else -> null
        }
    }

    override fun isDeprecated(): Boolean {
        return false
    }

    override fun getComponents(): Map<String, AbstractOasParameterDefinition> {
        return componentsResolver.resolve()
    }

    override fun getHttpMethod(): List<String> {
        return endpoint.getHttpMethod()
    }

    override fun getUrl(): String? {
        return endpoint.getUrl()
    }
}