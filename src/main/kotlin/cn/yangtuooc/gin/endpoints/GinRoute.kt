package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.receiverReference
import com.goide.psi.GoCallExpr
import com.intellij.psi.PsiAnchor
import com.intellij.psi.PsiElement

/**
 * @author yangtuo
 */
class GinRoute(
    val path: String,
    val requestType: String,
    val receiver: String,
    val anchor: PsiAnchor
) {
    fun isValid(): Boolean = anchor.retrieve() != null
    fun getFunctionDeclaration(): PsiElement? = (anchor.retrieve() as GoCallExpr).receiverReference().resolve()
}