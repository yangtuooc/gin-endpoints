package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.findGinRoutes
import cn.yangtuooc.gin.endpoints.oas.GinOpenApiSpecificationBuilder
import com.intellij.microservices.endpoints.*
import com.intellij.microservices.endpoints.presentation.HttpMethodPresentation
import com.intellij.microservices.oas.OpenApiSpecification
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ModificationTracker
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinEndpointsProvider : EndpointsUrlTargetProvider<GinRoutePointer, GinUrlMappingElement> {

    override val endpointType: EndpointType = HTTP_SERVER_TYPE
    override val presentation: FrameworkPresentation =
        FrameworkPresentation("Gin Web Framework", "Gin Web Framework", GinEndpointsIcons.GIN_LOGO)

    override fun getEndpointGroups(project: Project, filter: EndpointsFilter): Iterable<GinRoutePointer> {
        if (filter is ModuleEndpointsFilter) {
            val module = filter.module
            if (!hasGinLibrary(module)) return emptySet()

            return module.findGinRoutes()
        }
        return emptySet()
    }


    override fun getModificationTracker(project: Project): ModificationTracker {
        return GinModificationTrackersManager.getInstance(project).getEndpointsModificationTracker()
    }

    override fun getStatus(project: Project): EndpointsProvider.Status {
        if (hasGinLibrary(project)) return EndpointsProvider.Status.HAS_ENDPOINTS
        return EndpointsProvider.Status.UNAVAILABLE
    }

    override fun getUrlTargetInfo(group: GinRoutePointer, endpoint: GinUrlMappingElement): Iterable<UrlTargetInfo> {
        val targetInfo = findUrlTargetInfo(group, endpoint)
        return listOf(targetInfo)
    }

    override fun isValidEndpoint(group: GinRoutePointer, endpoint: GinUrlMappingElement): Boolean {
        return endpoint.getNavigationTarget()?.isValid == true
    }

    override fun getEndpoints(group: GinRoutePointer): Iterable<GinUrlMappingElement> {
        return listOf(GinRoutePointerUrlMappingElement(group))
    }

    override fun getEndpointPresentation(group: GinRoutePointer, endpoint: GinUrlMappingElement): ItemPresentation {
        val httpUrl = GinUrlMappingElement.getPathPresentation(endpoint)
        val httpMethods = endpoint.getMethod().map { it.name }.toList()

        return HttpMethodPresentation(httpUrl, httpMethods, group.getLocationString(), GinEndpointsIcons.GIN_LOGO)
    }

    private fun findUrlTargetInfo(group: GinRoutePointer, endpoint: GinUrlMappingElement): UrlTargetInfo {
        val mapping = GinRoutePointerUrlMappingElement(group)
        return GinUrlTargetInfo(UrlConstants.HTTP_SCHEMAS, listOf(), mapping)
    }

    override fun getDocumentationElement(group: GinRoutePointer, endpoint: GinUrlMappingElement): PsiElement? {
        return endpoint.getDocumentationPsiElement()
    }

    override fun getOpenApiSpecification(group: GinRoutePointer, endpoint: GinUrlMappingElement): OpenApiSpecification {
        return GinOpenApiSpecificationBuilder(endpoint, findUrlTargetInfo(group, endpoint)).build()
    }
}