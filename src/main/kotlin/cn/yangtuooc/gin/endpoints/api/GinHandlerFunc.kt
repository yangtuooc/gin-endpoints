package cn.yangtuooc.gin.endpoints.api


/**
 * @author yangtuo
 */
interface GinHandlerFunc {
    fun getParameters(): List<AbstractOasParameter>
    fun getRequestBody(): AbstractOasRequestBody?
    fun getResponseHeaders(): List<AbstractOasParameter>
    fun getCookieParams(): List<AbstractOasParameter>
    fun getResponses(): List<AbstractOasResponse>
    fun getSummary(): String?
    fun getTags(): List<String>
    fun getDescription(): String?
    fun getOperationId(): String?
    fun isDeprecated(): Boolean
    fun getComponents(): Map<String, AbstractOasParameter>
    fun getHttpMethod(): List<String>
    fun getUrl(): String?
}







