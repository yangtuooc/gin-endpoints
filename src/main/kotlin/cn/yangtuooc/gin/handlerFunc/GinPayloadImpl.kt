package cn.yangtuooc.gin.handlerFunc

import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinPayloadImpl(
    private val navigationTarget: PsiElement
) : GinPayload {


    override fun getParameters(): List<GinParameter> {
        return emptyList()
    }

    override fun getResponses(): List<Response> {
        return emptyList()
    }
}