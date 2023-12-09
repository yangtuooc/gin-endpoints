package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoFile
import com.goide.sdk.GoSdkUtil
import com.intellij.microservices.endpoints.*
import com.intellij.microservices.endpoints.EndpointsProvider.Status
import com.intellij.microservices.endpoints.presentation.HttpMethodPresentation
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.components.ComponentManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ModificationTracker
import kotlin.jvm.internal.Intrinsics

/**
 * @author yangtuo
 */
class GinEndpointsProvider : EndpointsUrlTargetProvider<GoFile, GinUrlData> {

    override val endpointType: EndpointType = HTTP_SERVER_TYPE
    override val presentation: FrameworkPresentation =
        FrameworkPresentation("Gin Web Framework", "Gin Web Framework", GinEndpointsIcons.GIN_LOGO)

    override fun getEndpointGroups(project: Project, filter: EndpointsFilter): Iterable<GoFile> {
        Intrinsics.checkNotNullParameter(project, "project")
        Intrinsics.checkNotNullParameter(filter, "filter")
        if (filter !is SearchScopeEndpointsFilter) {
            return emptyList()
        }
        return findGoFilesWithServerDeclarations(project, filter.searchScope)
    }

    override fun getModificationTracker(project: Project): ModificationTracker {
        Intrinsics.checkNotNullParameter(project, "project")
        val manager = project as ComponentManager
        return manager.getService(GoLangModificationTracker::class.java)
    }

    override fun getStatus(project: Project): Status {
        Intrinsics.checkNotNullParameter(project, "project")
        val goModules = GoSdkUtil.getGoModules(project)
        Intrinsics.checkNotNullExpressionValue(goModules, "getGoModules(project)")
        return if (goModules.isNotEmpty()) Status.AVAILABLE else Status.UNAVAILABLE
    }

    override fun getUrlTargetInfo(group: GoFile, endpoint: GinUrlData): Iterable<UrlTargetInfo> {
        Intrinsics.checkNotNullParameter(group, "group")
        Intrinsics.checkNotNullParameter(endpoint, "endpoint")
        return listOf(createUrlTargetInfo(endpoint))
    }

    override fun isValidEndpoint(group: GoFile, endpoint: GinUrlData): Boolean =
        group.isValid && endpoint.getSourcePsi().isValid

    override fun getEndpoints(group: GoFile): Iterable<GinUrlData> {
        Intrinsics.checkNotNullParameter(group, "group")
        return getOrComputeEndpointsInFile(group)
    }

    override fun getEndpointPresentation(group: GoFile, endpoint: GinUrlData): ItemPresentation {
        Intrinsics.checkNotNullParameter(group, "group")
        Intrinsics.checkNotNullParameter(endpoint, "endpoint")
        return HttpMethodPresentation(
            endpoint.getUrl(),
            endpoint.getHttpMethod(),
            endpoint.getLocationString(),
            GinEndpointsIcons.GIN_LOGO
        )
    }
}