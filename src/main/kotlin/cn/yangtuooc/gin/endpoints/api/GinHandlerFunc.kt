package cn.yangtuooc.gin.endpoints.api


/**
 * @author yangtuo
 */
interface GinHandlerFunc {
    fun getParameters(): List<AbstractOasParameter>
    fun getRequestBody(): AbstractOasRequestBody?
    fun getResponseHeaders(): List<AbstractOasParameterDefinition>
    fun getCookieParams(): List<AbstractOasParameterDefinition>
    fun getResponses(): List<AbstractOasResponse>
    fun getSummary(): String?
    fun getTags(): List<String>
    fun getDescription(): String?
    fun getOperationId(): String?
    fun isDeprecated(): Boolean
    fun getComponents(): Map<String, AbstractOasParameterDefinition>
    fun getHttpMethod(): List<String>
    fun getUrl(): String?
}







