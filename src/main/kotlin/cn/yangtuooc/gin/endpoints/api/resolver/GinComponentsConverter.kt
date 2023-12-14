package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasComponents

/**
 * @author yangtuo
 */
class GinComponentsConverter(
    val group: GoFile,
    val endpoint: GinUrlData
) : OpenApiSpecificationConverter<OasComponents?> {

    override fun convert(): OasComponents? {
        return null
    }
}