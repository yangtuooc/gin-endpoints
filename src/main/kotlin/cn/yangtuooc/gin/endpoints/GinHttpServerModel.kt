package cn.yangtuooc.gin.endpoints

import com.goide.psi.GoFile
import com.goide.psi.GoNamedElement
import com.intellij.microservices.url.UrlTargetInfo
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Key
import com.intellij.psi.SmartPsiElementPointer
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.CachedValue
import com.intellij.psi.util.CachedValueProvider.Result
import com.intellij.psi.util.CachedValuesManager

/**
 * @author yangtuo
 */

val LIBRARY_SERVER_FUNCTIONS_KEY =
    Key.create<CachedValue<List<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>>>>(
        "GinLibraryServerFunctions"
    )

fun findGoFilesWithGinServerDeclarations(
    project: Project,
    scope: GlobalSearchScope
): Iterable<GoFile> {
    val psiFiles = findAllGoFilesWithWords(project, scope, knownGinServerLocationShortNames())
    return psiFiles.filter { it.isValid && it is GoFile }.map { it as GoFile }
}

fun createUrlTargetInfo(endpoint: GinUrlData): UrlTargetInfo {
    return endpoint.toUrlTargetInfo()
}

fun getOrComputeEndpointsInFile(file: GoFile): List<GinUrlData> {
    val project = file.project
    return CachedValuesManager.getManager(project).getCachedValue(file) {
        Result.create(
            computeEndpoints(file),
            listOf(GoLangModificationTracker.getInstance(project))
        )
    }
}

internal fun computeEndpoints(file: GoFile): List<GinUrlData> {
    val project = file.project
    val stdLibDeclarations =
        getOrComputeStdLibDeclarations(
            project,
            LIBRARY_SERVER_FUNCTIONS_KEY,
            knownGinServerUrlLocations()
        )

    return stdLibDeclarations
        .flatMap {
            val searchScope = GlobalSearchScope.fileScope(file)
            findArgumentByIndexAmongUsages(it, searchScope)
        }
}