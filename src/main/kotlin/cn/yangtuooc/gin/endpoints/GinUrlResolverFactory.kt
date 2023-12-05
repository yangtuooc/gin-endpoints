package cn.yangtuooc.gin.endpoints

import com.intellij.microservices.url.*
import com.intellij.openapi.project.Project

/**
 * @author yangtuo
 */
class GinUrlResolverFactory : UrlResolverFactory {
    override fun forProject(project: Project): UrlResolver? {
        return GinUrlResolver(project)
    }
}

class GinUrlResolver(private val project: Project) : UrlResolver {
    override val supportedSchemes: List<String>
        get() = HTTP_SCHEMES

    override fun getVariants(): Iterable<UrlTargetInfo> {
        return emptyList()
    }

    override fun resolve(request: UrlResolveRequest): Iterable<UrlTargetInfo> {
        TODO("Not yet implemented")
    }
}