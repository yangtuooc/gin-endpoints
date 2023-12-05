package cn.yangtuooc.gin.endpoints.ext

import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.goide.psi.GoReferenceExpression
import com.goide.psi.GoVarDefinition
import com.intellij.psi.util.PsiTreeUtil

/**
 * @author yangtuo
 */

fun GoCallExpr.receiver(): String {
    return this.argumentList.expressionList.lastOrNull()?.text ?: ""
}

fun GoCallExpr.requestType(): String {
    return this.expression.lastChild.text
}

fun GoCallExpr.path(): String {
    if (this.getSubPath().isNullOrEmpty()) {
        return this.getBashPath() ?: ""
    }
    if (this.getBashPath().isNullOrEmpty()) {
        return this.getSubPath() ?: ""
    }
    return "${this.getBashPath()}${this.getSubPath()}"
}

fun GoCallExpr.getSubPath(): String? {
    val path = this.argumentList.expressionList.firstOrNull()?.text?.trim('"')
    if (path.isNullOrEmpty()) {
        return null
    }
    if (path.contains(Regex(":(\\w+)"))) {
        return path.replace(Regex(":(\\w+)"), "{$1}")
    }
    return path
}

fun GoCallExpr.getBashPath(): String? {
    val variableName = this.expression.firstChild.text
    val file = this.containingFile as GoFile

    val varDefinitions = PsiTreeUtil.findChildrenOfType(file, GoVarDefinition::class.java)
    for (varDef in varDefinitions) {
        if (variableName.contains(varDef.text)) {
            val callExpr = PsiTreeUtil.findChildOfType(varDef.parent, GoCallExpr::class.java)
            if (callExpr?.text?.contains(".Group") == true) {
                return Regex(".Group\\(\"(.*?)\"\\)").find(callExpr.text)?.groups?.get(1)?.value
            }
        }
    }
    return null
}


fun GoCallExpr.isGinRoute(): Boolean {
    if (this.expression is GoReferenceExpression) {
        val methodName = this.expression.lastChild.text
        return methodName in listOf("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS", "HEAD")
    }
    return false
}