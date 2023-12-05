package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoCallExpr
import com.goide.psi.GoRecursiveVisitor
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiAnchor
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope

/**
 * @author yangtuo
 */
internal fun hasGinFlow(project: Project): Boolean {
    return true
}

internal fun hasGinFlow(module: Module): Boolean {
    return true
}

internal fun findGinRoutes(project: Project, scope: GlobalSearchScope): Collection<GinRoute> {
    val routes = mutableListOf<GinRoute>()

    val goFiles = FilenameIndex.getAllFilesByExt(project, "go", scope)
    for (virtualFile in goFiles) {
        val goFile = PsiManager.getInstance(project).findFile(virtualFile)

        goFile?.accept(object : GoRecursiveVisitor() {
            override fun visitCallExpr(expr: GoCallExpr) {
                if (expr.isGinRoute()) {
                    routes.add(
                        GinRoute(
                            expr.path(),
                            expr.requestType(),
                            expr.receiver(),
                            PsiAnchor.create(expr)
                        )
                    )
                }
            }
        })
    }
    return routes
}


