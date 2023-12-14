package cn.yangtuooc.gin.endpoints.api.resolver

/**
 * @author yangtuo
 */
interface OpenApiSpecificationConverter<R> {
    fun convert(): R
}