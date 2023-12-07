package cn.yangtuooc.gin.handlerFunc

/**
 * @author yangtuo
 */
enum class PayloadType {
    QueryString,
    PathVariable,
    RequestBody,
    Header,
    Cookie;
}