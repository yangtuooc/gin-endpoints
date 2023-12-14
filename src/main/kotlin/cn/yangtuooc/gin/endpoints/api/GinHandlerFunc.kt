package cn.yangtuooc.gin.endpoints.api

/**
 * @author yangtuo
 */
interface GinHandlerFunc {

    fun name(): String
    fun isDeprecated(): Boolean
    fun description(): String
    fun summary(): String

}