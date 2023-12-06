package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.getLocationString
import cn.yangtuooc.gin.endpoints.ext.path
import cn.yangtuooc.gin.endpoints.ext.receiverReference
import cn.yangtuooc.gin.endpoints.ext.requestType
import com.goide.psi.GoCallExpr
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinRoutePointer(private val expr: GoCallExpr) {

    fun getLocationString(): String {
        return expr.getLocationString()
    }

    fun getNavigationTarget(): PsiElement? {
        return expr.receiverReference().resolve()
    }

    fun getURL(): String {
        return expr.path()
    }

    fun getMethod(): List<RequestMethod> {
        return listOf(RequestMethod.of(expr.requestType()))
    }
}



