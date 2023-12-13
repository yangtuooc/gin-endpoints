package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasResponse
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinResponsesResolver(group: GoFile, endpoint: GinUrlData) :
    GinResolver<List<AbstractOasResponse>> {
    override fun resolve(): List<AbstractOasResponse> {
        TODO("Not yet implemented")
    }
}