package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameterDefinition
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinHeadersResolver(
    group: GoFile,
    endpoint: GinUrlData
) : GinResolver<List<AbstractOasParameterDefinition>> {

    override fun resolve(): List<AbstractOasParameterDefinition> {
        return emptyList()
    }
}