package cn.yangtuooc.gin.endpoints

import com.intellij.microservices.url.UrlPath
import com.intellij.psi.PsiElement
import com.intellij.psi.SmartPointerManager

/**
 * @author yangtuo
 */
class GinRoutePointerUrlMappingElement(private val routePointer: GinRoutePointer) : GinUrlMappingElement {
    override fun getURL(): String {
        return routePointer.getURL()
    }

    override fun getUrlPath(): UrlPath {
        val segment = UrlPath.PathSegment.Exact(routePointer.getURL())
        return UrlPath(listOf(segment))
    }

    override fun getNavigationTarget(): PsiElement? {
        val element = routePointer.getNavigationTarget() ?: return null
        return SmartPointerManager.createPointer(element).element
    }

    override fun getMethod(): List<RequestMethod> {
        return routePointer.getMethod()
    }

    override fun getPresentation(): String {
        return getUrlPath().getPresentation()
    }

    override fun getDocumentationPsiElement(): PsiElement? {
        return this.getNavigationTarget()
    }

}