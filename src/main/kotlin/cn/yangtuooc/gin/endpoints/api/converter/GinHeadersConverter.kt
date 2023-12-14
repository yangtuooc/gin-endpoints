package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasHeader

/**
 * @author yangtuo
 */
class GinHeadersConverter(
    group: GoFile,
    endpoint: GinUrlData
) : OpenApiSpecificationConverter<List<OasHeader>> {

    override fun convert(): List<OasHeader> {
        return emptyList()
    }
}