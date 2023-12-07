package cn.yangtuooc.gin.handlerFunc

/**
 * @author yangtuo
 */
interface Response {
    fun getStatusCode(): Int
    fun getDescription(): String
    fun getParameters(): List<GinParameter>
}