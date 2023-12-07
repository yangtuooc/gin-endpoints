package cn.yangtuooc.gin.handlerFunc

import cn.yangtuooc.gin.endpoints.GinUrlMappingElement
import com.goide.documentation.GoDocumentationProvider
import com.goide.psi.GoFunctionLit
import com.goide.psi.GoMethodDeclaration
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.psi.PsiComment

/**
 * @author yangtuo
 */
class GinHandlerFuncImpl(
    private val endpoint: GinUrlMappingElement,
    private val urlTargetInfo: UrlTargetInfo
) : GinHandlerFunc {

    private val comments: MutableList<PsiComment>
        get() {
            val navigationTarget = endpoint.getNavigationTarget() ?: return mutableListOf()
            return GoDocumentationProvider.getUpperComments(navigationTarget)
        }

    override fun getName(): String {
        return when (val navigationTarget = endpoint.getNavigationTarget()) {
            is GoMethodDeclaration -> navigationTarget.identifier?.text ?: ""
            is GoFunctionLit -> navigationTarget.text
            else -> ""
        }
    }

    override fun getPayload(): GinPayload? {
        return endpoint.getNavigationTarget()?.let {
            return GinPayloadImpl(it)
        }
    }

    override fun getHandlerFuncComment(): String? {
        return comments
            .filter { it.text.contains(getName()) }
            .takeIf { it.isNotEmpty() }
            ?.joinToString(",") { it.text.removePrefix("//").trim().removePrefix(getName()).trim() }
    }

    override fun getDescription(): String? {
        return comments
            .filter { it.text.contains("Description:") }
            .takeIf { it.isNotEmpty() }
            ?.joinToString(",") { it.text.removePrefix("//").trim().removePrefix("Description:").trim() }
    }

    override fun isDeprecated(): Boolean {
        return comments.any { it.text.contains("Deprecated:") }
    }

}