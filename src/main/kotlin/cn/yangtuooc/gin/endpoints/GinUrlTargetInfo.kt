package cn.yangtuooc.gin.endpoints

import com.intellij.microservices.url.Authority
import com.intellij.microservices.url.UrlPath
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinUrlTargetInfo(
    override val schemes: List<String>,
    override val authorities: List<Authority>,
    private val urlMapping: GinUrlMappingElement,
) : UrlTargetInfo {

    override val methods: Set<String>
        get() = urlMapping.getMethod().map { it.name }.toSet()

    override val path: UrlPath
        get() = urlMapping.getUrlPath()


    override fun resolveToPsiElement(): PsiElement? {
        return urlMapping.getNavigationTarget()
    }


}