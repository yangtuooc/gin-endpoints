package cn.yangtuooc.gin.handlerFunc

/**
 * @author yangtuo
 */
interface GinPayload {
    fun getParameters(): List<GinParameter>
    fun getResponses(): List<Response>
}