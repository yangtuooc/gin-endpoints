package cn.yangtuooc.gin.endpoints

import com.intellij.psi.PsiAnchor

/**
 * @author yangtuo
 */
class GinRoute(
    val path: String,
    val requestType: String,
    val receiver: String,
    private val anchor: PsiAnchor
) {
    fun isValid(): Boolean = anchor.retrieve() != null
}