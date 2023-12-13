package cn.yangtuooc.gin.endpoints.api.resolver

import cn.yangtuooc.gin.endpoints.GinUrlData
import cn.yangtuooc.gin.endpoints.api.AbstractOasRequestBody
import com.goide.psi.GoFile

/**
 * @author yangtuo
 */
class GinRequestBodyResolver(group: GoFile, endpoint: GinUrlData) :
    GinResolver<AbstractOasRequestBody?> {
    override fun resolve(): AbstractOasRequestBody? {
        return null
    }
}