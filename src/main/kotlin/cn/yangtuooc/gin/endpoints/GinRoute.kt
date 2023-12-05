package cn.yangtuooc.gin.endpoints

import com.intellij.psi.PsiAnchor

/**
 * @author yangtuo
 */
class GinRoute(
    val urlMapping: String,
    val locationString: String,
    private val anchor: PsiAnchor
) {
    fun isValid(): Boolean = anchor.retrieve() != null
}