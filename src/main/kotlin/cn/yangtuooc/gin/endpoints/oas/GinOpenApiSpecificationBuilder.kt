package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.GinRoutePointer
import cn.yangtuooc.gin.endpoints.GinUrlMappingElement
import com.intellij.microservices.oas.OasComponents
import com.intellij.microservices.oas.OasEndpointPath
import com.intellij.microservices.oas.OasTag
import com.intellij.microservices.oas.OpenApiSpecification

/**
 * @author yangtuo
 */
class GinOpenApiSpecificationBuilder(
    private val group: GinRoutePointer,
    private val mapping: GinUrlMappingElement
) {

    private val emptyOas = OpenApiSpecification(emptyList(), null, null)

    fun build(): OpenApiSpecification {
        return OpenApiSpecification(buildPaths(), buildComponents(), buildTags())
    }

    private fun buildTags(): List<OasTag>? {
        TODO("Not yet implemented")
    }

    private fun buildComponents(): OasComponents? {
        TODO("Not yet implemented")
    }

    private fun buildPaths(): Collection<OasEndpointPath> {
        TODO("Not yet implemented")
        OasEndpointPath()
        val path = mapping.getPresentation()
        mapping.getDocumentationPsiElement()
    }
}