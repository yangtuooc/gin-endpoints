package cn.yangtuooc.gin.endpoints.api

import cn.yangtuooc.gin.endpoints.GinUrlData
import com.goide.psi.GoFile
import com.intellij.psi.search.PsiSearchHelper

/**
 * @author yangtuo
 */
class GinApiResolver(
    private val group: GoFile,
    private val endpoint: GinUrlData
) {

    fun resolve(): GinHandlerFunc {
        return GinHandlerFuncImpl()
    }

    private fun findAllRequestParams() {
        PsiSearchHelper.getInstance(group.project)
    }
}