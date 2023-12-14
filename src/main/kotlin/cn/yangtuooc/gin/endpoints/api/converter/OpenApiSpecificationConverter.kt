package cn.yangtuooc.gin.endpoints.api.converter

/**
 * @author yangtuo
 */
interface OpenApiSpecificationConverter<R> {
    fun convert(): R
}