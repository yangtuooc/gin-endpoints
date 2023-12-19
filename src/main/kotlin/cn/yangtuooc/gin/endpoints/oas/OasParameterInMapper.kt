package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.FunctionOrMethodParameterInfo
import cn.yangtuooc.gin.endpoints.GinServerParameterMappingMethod.*
import com.intellij.microservices.oas.OasParameterIn
import com.intellij.microservices.oas.OasSchemaType

/**
 * @author yangtuo
 */
enum class OasParameterInMapper(
    val parameterInfo: List<FunctionOrMethodParameterInfo>,
    val mapper: ParameterMapper
) {

    QUERY_STRING(
        listOf(
            QUERY,
            DEFAULT_QUERY,
        ),
        ParameterMapper.QUERY_STRING
    ),
    QUERY_OBJECT(
        listOf(
            BIND_QUERY,
            SHOULD_BIND_QUERY,
            SHOULD_BIND,
            BIND
        ),
        ParameterMapper.QUERY_OBJECT
    )
    ;

    companion object {
        fun map(parameterInfo: FunctionOrMethodParameterInfo): ParameterMapper? {
            return values().find {
                it.parameterInfo.contains(parameterInfo)
            }?.mapper
        }
    }
}


enum class ParameterMapper(
    val parameterIn: OasParameterIn,
    val type: OasSchemaType
) {
    QUERY_STRING(
        OasParameterIn.QUERY,
        OasSchemaType.STRING
    ),
    QUERY_OBJECT(
        OasParameterIn.QUERY,
        OasSchemaType.OBJECT
    )

    ;

    companion object {
        fun map(parameterIn: OasParameterIn): OasSchemaType? {
            return values().find {
                it.parameterIn == parameterIn
            }?.type
        }
    }
}
