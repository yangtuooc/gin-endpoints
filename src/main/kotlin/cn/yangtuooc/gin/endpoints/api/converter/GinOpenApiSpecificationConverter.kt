package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasEndpointPath
import com.intellij.microservices.oas.OasHttpMethod
import com.intellij.microservices.oas.OpenApiSpecification

/**
 * @author yangtuo
 */

class GinOpenApiSpecificationConverter(
    val group: GoFile,
    private val endpoint: GinUrlData
) : OpenApiSpecificationConverter<OpenApiSpecification> {

    private val componentsConverter = GinComponentsConverter(group, endpoint)
    private val operationConverter = GinOasOperationConverter(group, endpoint)

    override fun convert(): OpenApiSpecification {
        return OpenApiSpecification(
            paths = getPaths(),
            components = componentsConverter.convert(),
            tags = emptyList()
        )
    }

    private fun getPaths(): Collection<OasEndpointPath> {
        val oasOperationMap = operationConverter.convert()
        return endpoint.getHttpMethod().map { method ->
            OasEndpointPath(
                path = endpoint.getUrl() ?: "",
                summary = null,
                operations = listOfNotNull(oasOperationMap[OasHttpMethod.valueOf(method)])
            )
        }
    }

}
