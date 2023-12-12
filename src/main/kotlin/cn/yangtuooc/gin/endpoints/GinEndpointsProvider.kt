package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.oas.GinOpenApiSpecificationBuilder
import com.goide.psi.GoFile
import com.goide.sdk.GoSdkUtil
import com.intellij.microservices.endpoints.*
import com.intellij.microservices.endpoints.EndpointsProvider.Status
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
class GinEndpointsProvider : EndpointsUrlTargetProvider<GoFile, GinUrlData> {

    override val endpointType: EndpointType = HTTP_SERVER_TYPE
    override val presentation: FrameworkPresentation =
        FrameworkPresentation("Gin Web Framework", "Gin Web Framework", GinEndpointsIcons.GIN_LOGO)

    override fun getEndpointGroups(project: Project, filter: EndpointsFilter): Iterable<GoFile> {
        if (filter !is SearchScopeEndpointsFilter) {
            return emptyList()
        }
        return findGoFilesWithGinServerDeclarations(project, filter.searchScope)
    }

    override fun getModificationTracker(project: Project): ModificationTracker {
        return GoLangModificationTracker.getInstance(project)
    }

    override fun getStatus(project: Project): Status {
        val goModules = GoSdkUtil.getGoModules(project)
        return if (goModules.isNotEmpty()) Status.AVAILABLE else Status.UNAVAILABLE
    }

    override fun getUrlTargetInfo(group: GoFile, endpoint: GinUrlData): Iterable<UrlTargetInfo> {
        return listOf(createUrlTargetInfo(endpoint))
    }

    override fun isValidEndpoint(group: GoFile, endpoint: GinUrlData): Boolean =
        group.isValid && endpoint.getSourcePsi()?.isValid == true

    override fun getEndpoints(group: GoFile) = getOrComputeEndpointsInFile(group)

    override fun getDocumentationElement(group: GoFile, endpoint: GinUrlData): PsiElement? {
        return endpoint.getDocumentationPsiElement()
    }

    override fun getEndpointPresentation(group: GoFile, endpoint: GinUrlData): ItemPresentation {
        return HttpMethodPresentation(
            endpoint.getUrl(),
            endpoint.getHttpMethod(),
            endpoint.getLocationString(),
            GinEndpointsIcons.GIN_LOGO
        )
    }

    override fun getOpenApiSpecification(
        group: GoFile,
        endpoint: GinUrlData
    ): OpenApiSpecification? {
        return GinOpenApiSpecificationBuilder(group, endpoint).build()
    }
}