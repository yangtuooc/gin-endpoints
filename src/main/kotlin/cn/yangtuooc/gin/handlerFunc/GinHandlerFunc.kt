package cn.yangtuooc.gin.handlerFunc

/**
 * @author yangtuo
 */
interface GinHandlerFunc {
    fun getName(): String
    fun getPayload(): GinPayload?
    fun getHandlerFuncComment(): String?
    fun getDescription(): String?
    fun isDeprecated(): Boolean
}

