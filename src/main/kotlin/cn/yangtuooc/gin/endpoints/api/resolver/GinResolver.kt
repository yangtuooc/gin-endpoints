package cn.yangtuooc.gin.endpoints.api.resolver

/**
 * @author yangtuo
 */
interface GinResolver<R> {
    fun resolve(): R
}