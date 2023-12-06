package cn.yangtuooc.gin.endpoints.ext

import com.goide.GoFileType
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.goide.psi.GoRecursiveVisitor
import com.intellij.openapi.module.Module
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex

/**
 * @author yangtuo
 */

fun Module.findGinRouteExpressions(): Set<GoCallExpr> {

    val routes = mutableSetOf<GoCallExpr>()
    val goFiles = FileTypeIndex.getFiles(GoFileType.INSTANCE, moduleContentScope)
    goFiles.forEach { virtualFile ->
        val goFile = PsiManager.getInstance(project).findFile(virtualFile) as GoFile
        if (goFile.hasImportsGin()) {
            goFile.accept(object : GoRecursiveVisitor() {
                override fun visitCallExpr(o: GoCallExpr) {
                    if (o.isGinRoute()) {
                        routes.add(o)
                    }
                }
            })
        }
    }
    return routes
}