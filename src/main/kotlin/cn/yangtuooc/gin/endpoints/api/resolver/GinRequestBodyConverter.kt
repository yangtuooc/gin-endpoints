package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasRequestBody

/**
 * @author yangtuo
 */
class GinRequestBodyConverter(group: GoFile, endpoint: GinUrlData) :
    OpenApiSpecificationConverter<OasRequestBody?> {
    override fun convert(): OasRequestBody? {
        return null
    }
}