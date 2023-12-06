package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.getLocationString
import cn.yangtuooc.gin.endpoints.ext.path
import cn.yangtuooc.gin.endpoints.ext.receiverReference
import cn.yangtuooc.gin.endpoints.ext.requestType
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFunctionLit
import com.goide.psi.GoReferenceExpression
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinRoutePointer(private val expr: GoCallExpr) {

    fun getLocationString(): String {
        return expr.getLocationString()
    }

    fun getNavigationTarget(): PsiElement? {
        return when (val reference = expr.receiverReference()) {
            is GoReferenceExpression -> reference.resolve()
            is GoFunctionLit -> reference
            else -> null
        }
    }

    fun getURL(): String {
        return expr.path()
    }

    fun getMethod(): List<RequestMethod> {
        return listOf(RequestMethod.of(expr.requestType()))
    }
}



