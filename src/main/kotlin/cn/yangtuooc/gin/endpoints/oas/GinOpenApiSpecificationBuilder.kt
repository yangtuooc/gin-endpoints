package cn.yangtuooc.gin.endpoints.oas

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OpenApiSpecification

/**
 * @author yangtuo
 */
class GinOpenApiSpecificationBuilder(
    private val group: GoFile,
    private val endpoint: GinUrlData
) {

    fun build(): OpenApiSpecification? {
        TODO("Not yet implemented")
    }
}