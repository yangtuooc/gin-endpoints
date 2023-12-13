package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameterDefinition
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinComponentsResolver(
    val group: GoFile,
    val endpoint: GinUrlData
) : GinResolver<Map<String, AbstractOasParameterDefinition>> {

    override fun resolve(): Map<String, AbstractOasParameterDefinition> {
        return emptyMap()
    }
}