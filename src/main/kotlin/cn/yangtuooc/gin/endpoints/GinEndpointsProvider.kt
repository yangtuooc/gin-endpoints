package cn.yangtuooc.gin.endpoints

import com.intellij.microservices.endpoints.*
import com.intellij.microservices.endpoints.EndpointsProvider.Status
import com.intellij.microservices.endpoints.presentation.HttpUrlPresentation
import com.intellij.microservices.url.UrlPath
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ModificationTracker

/**
 * @author yangtuo
 */
class GinEndpointsProvider : EndpointsProvider<GinRoute, GinRoute> {

    override val endpointType: EndpointType = HTTP_SERVER_TYPE
    override val presentation: FrameworkPresentation =
        FrameworkPresentation("Gin", "Gin Web Framework", GinEndpointsIcons.GinRoute)

    override fun getEndpointData(group: GinRoute, endpoint: GinRoute, dataId: String): Any? {
        TODO("Not yet implemented")
    }

    override fun getStatus(project: Project): Status {
        if (hasGinFlow(project)) return Status.HAS_ENDPOINTS
        return Status.UNAVAILABLE
    }

    override fun getEndpointGroups(project: Project, filter: EndpointsFilter): Iterable<GinRoute> {
        if (filter !is ModuleEndpointsFilter) return emptyList()
        if (!hasGinFlow(filter.module)) return emptyList()

        return findGinRoutes(project, filter.searchScope)
    }


    override fun getModificationTracker(project: Project): ModificationTracker {
        TODO("Not yet implemented")
    }

    override fun getEndpoints(group: GinRoute): Iterable<GinRoute> {
        return listOf(group)
    }

    override fun isValidEndpoint(group: GinRoute, endpoint: GinRoute): Boolean {
        return group.isValid()
    }

    override fun getEndpointPresentation(group: GinRoute, endpoint: GinRoute): ItemPresentation {
        return HttpUrlPresentation(normalizeUrl(group.urlMapping), group.locationString, GinEndpointsIcons.GinRoute)
    }

    private fun normalizeUrl(urlMapping: String): String {
        val urlString = run {
            if (urlMapping.isBlank()) return@run "/"
            if (!urlMapping.startsWith("/")) return@run "/$urlMapping"
            return@run urlMapping
        }
//        return parseGinUrlMapping(urlString).getPresentation(GinUrlRenderer)
        return urlString
    }

    private object GinUrlRenderer : UrlPath.PathSegmentRenderer {
        override fun visitVariable(variable: UrlPath.PathSegment.Variable): String {
            return "{${variable.variableName}}"
        }
    }

}