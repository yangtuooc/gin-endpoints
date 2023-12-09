package cn.yangtuooc.gin.endpoints

import com.goide.GoFileType
import com.goide.psi.GoNamedElement
import com.goide.psi.GoReferencesSearch
import com.goide.sdk.GoSdkUtil
import com.goide.stubs.index.GoAllPublicNamesIndex
import com.goide.stubs.index.GoNonPackageLevelNamesIndex
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.util.Key
import com.intellij.psi.PsiFile
import com.intellij.psi.SmartPointerManager
import com.intellij.psi.SmartPsiElementPointer
import com.intellij.psi.search.*
import com.intellij.psi.stubs.StubIndex
import com.intellij.psi.stubs.StubIndexKey
import com.intellij.psi.util.CachedValue
import com.intellij.psi.util.CachedValueProvider.Result
import com.intellij.psi.util.CachedValuesManager
import com.intellij.util.CommonProcessors.CollectProcessor
import com.intellij.util.Processor
import com.intellij.util.Processors

/**
 * @author yangtuo
 */

fun knownServerUrlLocations(): List<FunctionOrMethodParameterInfo> {
    return GinServerDefinitionMethod.values().toList()
}

fun knownServerLocationShortNames(): List<String> {
    return knownServerUrlLocations().map { it.fqn.shortName }
}

fun findAllGoFilesWithWords(project: Project, searchScope: GlobalSearchScope, markerWords: List<String>): Set<PsiFile> {
    val foundCandidates = mutableSetOf<PsiFile>()
    val processor = Processors.cancelableCollectProcessor(foundCandidates)
    processGoFiles(project, searchScope, processor, markerWords)
    return foundCandidates
}

internal fun processGoFiles(
    project: Project,
    searchScope: GlobalSearchScope,
    processor: Processor<PsiFile>,
    markerWords: List<String>
) {
    val filesScope = GlobalSearchScope.filesScope(project, FileTypeIndex.getFiles(GoFileType.INSTANCE, searchScope))
    for (word in markerWords) {
        PsiSearchHelper.getInstance(project).processAllFilesWithWord(word, filesScope, processor, true)
    }
}

fun getOrComputeStdLibDeclarations(
    project: Project,
    cacheKey: Key<CachedValue<List<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>>>>,
    suitableLocations: List<FunctionOrMethodParameterInfo>
): List<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>> {

    fun cachedValueProvider(): Result<List<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>>> {
        val stdLibDeclarations = suitableLocations.flatMap { discoverStdLibDeclaration(project, it) }
        return Result.create(stdLibDeclarations, listOf(ProjectRootManager.getInstance(project)))
    }

    return CachedValuesManager.getManager(project).getCachedValue(project, cacheKey, ::cachedValueProvider, false)
}


internal fun discoverStdLibDeclaration(
    project: Project,
    location: FunctionOrMethodParameterInfo
): List<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>> {
    val foundElements = mutableListOf<GoNamedElement>()
    val cancelableCollectProcessor = object : CollectProcessor<GoNamedElement>(foundElements) {

        override fun process(element: GoNamedElement?): Boolean {
            ProgressManager.checkCanceled()
            return super.process(element)
        }

        override fun accept(element: GoNamedElement?): Boolean {
            return element?.let {
                GoSdkUtil.isInSdk(it.containingFile)
                        && it.qualifiedName == location.fqn.asInPsi
            } ?: false
        }
    }

    val indexKey: StubIndexKey<String, GoNamedElement> = when (location.fqn) {
        is Function -> GoAllPublicNamesIndex.ALL_PUBLIC_NAMES
        is Method -> GoNonPackageLevelNamesIndex.KEY
        else -> return mutableListOf()
    }

    StubIndex.getInstance().processElements(
        indexKey,
        location.fqn.asInIndex,
        project,
        ProjectScope.getLibrariesScope(project),
        GoNamedElement::class.java,
        cancelableCollectProcessor
    )

    val destinations = mutableListOf<Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>>()
    for (foundElement in foundElements) {
        destinations.add(
            location to SmartPointerManager.getInstance(project).createSmartPsiElementPointer(foundElement)
        )
    }
    return destinations
}


fun findArgumentByIndexAmongUsages(
    locationToPsi: Pair<FunctionOrMethodParameterInfo, SmartPsiElementPointer<GoNamedElement>>,
    searchScope: SearchScope
): List<GinUrlData> {
    val element = locationToPsi.second.element ?: return emptyList()
    val psiReferences = GoReferencesSearch.search(element, searchScope)
    val results = mutableListOf<GinUrlData>()
//    for (reference in psiReferences) {
//        results.add(GinUrlData())
//    }
    return emptyList()
}