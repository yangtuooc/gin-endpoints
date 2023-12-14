package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.FunctionOrMethodParameterInfo
import cn.yangtuooc.gin.endpoints.GinServerParameterMappingMethod.*
import com.intellij.microservices.oas.OasParameterIn

/**
 * @author yangtuo
 */
enum class OasParameterInMapper(
    val parameterInfo: List<FunctionOrMethodParameterInfo>,
    val oasParameterIn: OasParameterIn
) {

    QUERY_STRING(
        listOf(
            QUERY,
            BIND_QUERY,
            SHOULD_BIND_QUERY,
        ),

        OasParameterIn.QUERY
    ), ;

    companion object {
        fun map(parameterInfo: FunctionOrMethodParameterInfo): OasParameterIn? {
            return values().find {
                it.parameterInfo.contains(parameterInfo)
            }?.oasParameterIn
        }
    }
}


