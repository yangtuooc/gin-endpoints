package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoFile
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope

/**
 * @author yangtuo
 */

fun findGoFilesWithServerDeclarations(project: Project, scope: GlobalSearchScope): Iterable<GoFile> {
    TODO()
}

fun createUrlTargetInfo(endpoint: GinUrlData): UrlTargetInfo {
    TODO()
}

fun getOrComputeEndpointsInFile(file: GoFile): Iterable<GinUrlData> {
    TODO()
}