package cn.yangtuooc.gin.endpoints

import com.intellij.microservices.url.UrlPath
import com.intellij.openapi.util.text.StringUtil
import com.intellij.psi.PsiElement


/**
 * @author yangtuo
 */
interface GinUrlMappingElement {

    fun getURL(): String

    fun getUrlPath(): UrlPath

    fun getNavigationTarget(): PsiElement?

    fun getMethod(): List<RequestMethod>

    fun getPresentation(): String

    fun getDocumentationPsiElement(): PsiElement?

    companion object {
        fun getPathPresentation(item: GinUrlMappingElement): String {
            val presentation = item.getPresentation()
            if (StringUtil.startsWithChar(presentation, '/')) {
                return presentation
            }
            return "/$presentation"
        }
    }
}

