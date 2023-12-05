package cn.yangtuooc.gin.endpoints

import cn.yangtuooc.gin.endpoints.ext.*
import com.goide.psi.GoCallExpr
import com.goide.psi.GoFile
import com.goide.psi.GoRecursiveVisitor
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiAnchor
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FilenameIndex
import com.intellij.psi.search.GlobalSearchScope
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 * @author yangtuo
 */
internal fun hasImportsGin(project: Project): Boolean {
    return true
}

internal fun hasImportsGin(module: Module): Boolean {
    return true
}

// TODO: 引入Cache，避免每次都重复加载路由
internal fun findGinRoutes(project: Project, scope: GlobalSearchScope): Collection<GinRoute> {
    val routes = ConcurrentHashMap.newKeySet<GinRoute>()
    val goFiles = FilenameIndex.getAllFilesByExt(project, "go", scope)

    val executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())

    for (virtualFile in goFiles) {
        executorService.submit {
            ApplicationManager.getApplication().runReadAction {
                val goFile = PsiManager.getInstance(project).findFile(virtualFile) as GoFile

                if (goFile.hasImportsGin()) {
                    goFile.accept(object : GoRecursiveVisitor() {
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
            }
        }
    }

    executorService.shutdown()
    executorService.awaitTermination(5, TimeUnit.MINUTES)

    return routes.toList()
}


