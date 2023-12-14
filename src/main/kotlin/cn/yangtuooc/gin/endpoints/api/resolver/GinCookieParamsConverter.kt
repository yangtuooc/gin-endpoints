package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.microservices.oas.OasSchema

/**
 * @author yangtuo
 */
class GinCookieParamsConverter(
    val group: GoFile,
    val endpoint: GinUrlData
) : OpenApiSpecificationConverter<List<OasSchema>> {

    override fun convert(): List<OasSchema> {
        return emptyList()
    }
}