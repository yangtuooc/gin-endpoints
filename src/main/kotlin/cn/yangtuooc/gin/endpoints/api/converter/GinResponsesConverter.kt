package cn.yangtuooc.gin.endpoints.api.converter

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasResponse

/**
 * @author yangtuo
 */
class GinResponsesConverter(group: GoFile, endpoint: GinUrlData) :
    OpenApiSpecificationConverter<List<OasResponse>> {
    override fun convert(): List<OasResponse> {
        return emptyList()
    }
}