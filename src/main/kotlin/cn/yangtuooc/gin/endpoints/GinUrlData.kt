package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoExpression
import com.goide.psi.GoNamedElement
import com.intellij.psi.SmartPsiElementPointer

/**
 * @author yangtuo
 */
class GinUrlData(
        private val url: String,
        private val pointer: SmartPsiElementPointer<GoNamedElement>
) {

    fun getSourcePsi(): GoExpression {
        return pointer.element as GoExpression
    }

    fun getUrl(): String {
        return url
    }

    fun getHttpMethod(): List<String> {
        TODO()
    }

    fun getLocationString(): String {
        TODO()
    }
}