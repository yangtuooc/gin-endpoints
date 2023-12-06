package cn.yangtuooc.gin.endpoints

import com.intellij.openapi.util.text.StringUtil
import java.util.function.Function

enum class RequestMethod {
    GET,
    HEAD,
    POST,
    PUT,
    PATCH,
    DELETE,
    OPTIONS,
    TRACE,
    UNKNOWN;

    companion object {
        private val NAMING_FUNCTION = Function { obj: RequestMethod -> obj.name }
        fun of(method: String?): RequestMethod {
            return when (method) {
                "GET" -> GET
                "POST" -> POST
                "HEAD" -> HEAD
                "PUT" -> PUT
                "PATCH" -> PATCH
                "DELETE" -> DELETE
                "OPTIONS" -> OPTIONS
                "TRACE" -> TRACE
                else -> UNKNOWN
            }
        }

        fun getDisplay(vararg methods: RequestMethod): String {
            return "[" + StringUtil.join(methods, { t: RequestMethod -> NAMING_FUNCTION.apply(t) }, "|") + "]"
        }
    }
}
