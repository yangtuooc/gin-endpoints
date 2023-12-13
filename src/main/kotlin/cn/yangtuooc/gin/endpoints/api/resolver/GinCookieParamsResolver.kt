package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasParameter
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinCookieParamsResolver(
    val group: GoFile,
    val endpoint: GinUrlData
) : GinResolver<List<AbstractOasParameter>> {

    override fun resolve(): List<AbstractOasParameter> {
        TODO("Not yet implemented")
    }
}