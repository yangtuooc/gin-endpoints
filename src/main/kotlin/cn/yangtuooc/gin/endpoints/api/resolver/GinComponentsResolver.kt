package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameter
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinComponentsResolver(
    val group: GoFile,
    val endpoint: GinUrlData
) : GinResolver<Map<String, AbstractOasParameter>> {

    override fun resolve(): Map<String, AbstractOasParameter> {
        TODO("Not yet implemented")
    }
}