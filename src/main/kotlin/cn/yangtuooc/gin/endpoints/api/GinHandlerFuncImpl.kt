package cn.yangtuooc.gin.endpoints.api

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFunctionLit
import com.goide.psi.GoMethodDeclaration

/**
 * @author yangtuo
 */
class GinHandlerFuncImpl(val endpoint: GinUrlData) : GinHandlerFunc {

    override fun name(): String {
        return when (val declaration = endpoint.getDocumentationPsiElement()) {
            is GoMethodDeclaration -> declaration.name ?: ""
            is GoFunctionLit -> declaration.text
            else -> ""
        }
    }

    override fun isDeprecated(): Boolean {
        return false
    }

    override fun description(): String {
        return ""
    }

    override fun summary(): String {
        return ""
    }


}