package cn.yangtuooc.gin.endpoints.api

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.resolver.*
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinHandlerFuncImpl(
    private val group: GoFile,
    private val endpoint: GinUrlData
) : GinHandlerFunc {

    private val parameterResolver: GinResolver<List<AbstractOasParameter>> =
        GinParameterResolver(group, endpoint)

    private val requestBodyResolver: GinResolver<AbstractOasRequestBody> =
        GinRequestBodyResolver(group, endpoint)

    private val responsesResolver: GinResolver<List<AbstractOasResponse>> =
        GinResponsesResolver(group, endpoint)

    private val responseHeadersResolver: GinResolver<List<AbstractOasParameter>> =
        GinHeadersResolver(group, endpoint)

    private val componentsResolver: GinResolver<Map<String, AbstractOasParameter>> =
        GinComponentsResolver(group, endpoint)

    private val cookieParamsResolver: GinResolver<List<AbstractOasParameter>> =
        GinCookieParamsResolver(group, endpoint)

    override fun getParameters(): List<AbstractOasParameter> {
        return parameterResolver.resolve()
    }

    override fun getRequestBody(): AbstractOasRequestBody {
        return requestBodyResolver.resolve()
    }

    override fun getResponseHeaders(): List<AbstractOasParameter> {
        return responseHeadersResolver.resolve()
    }

    override fun getCookieParams(): List<AbstractOasParameter> {
        return cookieParamsResolver.resolve()
    }

    override fun getResponses(): List<AbstractOasResponse> {
        return responsesResolver.resolve()
    }


    override fun getSummary(): String? {
        TODO("Not yet implemented")
    }

    override fun getTags(): List<String> {
        TODO("Not yet implemented")
    }

    override fun getDescription(): String? {
        TODO("Not yet implemented")
    }

    override fun getOperationId(): String? {
        return null
    }

    override fun isDeprecated(): Boolean {
        return false
    }

    override fun getComponents(): Map<String, AbstractOasParameter> {
        return componentsResolver.resolve()
    }

    override fun getHttpMethod(): List<String> {
        return endpoint.getHttpMethod()
    }

    override fun getUrl(): String? {
        return endpoint.getUrl()
    }
}