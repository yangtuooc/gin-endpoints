package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoCallExpr
import com.goide.psi.GoExpression
import com.goide.psi.GoReferenceExpression
import com.intellij.microservices.url.Authority
import com.intellij.microservices.url.UrlPath
import com.intellij.microservices.url.UrlPath.PathSegment
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.psi.PsiElement
import com.intellij.psi.SmartPsiElementPointer

/**
 * @author yangtuo
 */
class GinUrlData(
    private val url: String?,
    private val pointer: SmartPsiElementPointer<GoExpression>
) {

    fun getSourcePsi(): GoExpression? {
        return pointer.element
    }

    fun getUrl(): String? {
        return url
    }

    fun getHttpMethod(): List<String> {
        return when (val element = pointer.element) {
            is GoCallExpr -> {
                when (val expression = element.expression) {
                    is GoReferenceExpression -> listOf(expression.identifier.text)
                    else -> emptyList()
                }
            }

            else -> emptyList()
        }
    }

    fun getLocationString(): String? {
        return when (val element = pointer.element) {
            is GoCallExpr -> element.argumentList.expressionList.lastOrNull()?.text
            else -> null
        }
    }

    fun toUrlTargetInfo(): UrlTargetInfo {
        return object : UrlTargetInfo {
            override val authorities: List<Authority>
                get() = emptyList()
            override val path: UrlPath
                get() = UrlPath(listOf(PathSegment.Exact(getUrl() ?: "")))
            override val schemes: List<String>
                get() = emptyList()

            override fun resolveToPsiElement(): PsiElement? {
                return getSourcePsi()
            }
        }
    }

    fun getDocumentationPsiElement(): PsiElement? {
        return when (val goExpression = pointer.element) {
            is GoCallExpr -> goExpression.argumentList.expressionList.lastOrNull()?.reference?.resolve()
            else -> null
        }
    }
}