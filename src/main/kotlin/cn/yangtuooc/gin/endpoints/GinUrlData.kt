package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoExpression
import com.intellij.psi.SmartPsiElementPointer

/**
 * @author yangtuo
 */
class GinUrlData(
    private val url: String?,
    private val pointer: SmartPsiElementPointer<GoExpression>
) {

    fun getSourcePsi(): GoExpression? {
        return pointer.element
    }

    fun getUrl(): String? {
        return url
    }

    fun getHttpMethod(): List<String> {
        return listOf("GET")
    }

    fun getLocationString(): String {
        return pointer.element?.text ?: ""
    }
}