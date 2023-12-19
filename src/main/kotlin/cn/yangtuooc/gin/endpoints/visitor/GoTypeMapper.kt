package cn.yangtuooc.gin.endpoints.visitor

import com.goide.psi.GoType
import com.goide.psi.impl.GoTypeUtil
import com.intellij.microservices.oas.OasSchemaType
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
enum class GoTypeMapper {

    ;

    companion object {

        fun map(type: GoType, context: PsiElement?): OasSchemaType {
            return when {
                GoTypeUtil.isString(type, context) -> OasSchemaType.STRING
                GoTypeUtil.isIntType(type, context) -> OasSchemaType.INTEGER
                GoTypeUtil.isFloatType(type, context) -> OasSchemaType.NUMBER
                GoTypeUtil.isBoolean(type, context) -> OasSchemaType.BOOLEAN
                GoTypeUtil.isArray(type, context) -> OasSchemaType.ARRAY
                GoTypeUtil.isInt64(type, context) -> OasSchemaType.INTEGER
                // TODO: 2023/12/19 map other types
                else -> throw IllegalArgumentException("Unsupported type")
            }
        }
    }
}