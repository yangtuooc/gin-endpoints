package cn.yangtuooc.gin.endpoints

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.ModificationTracker
import com.intellij.openapi.util.SimpleModificationTracker

/**
 * @author yangtuo
 */
@Service(Service.Level.PROJECT)
class GinModificationTrackersManager {

    private val endpointsModificationTracker = SimpleModificationTracker()

    fun getEndpointsModificationTracker(): ModificationTracker {
        return this.endpointsModificationTracker
    }

    fun incModificationCount() {
        this.endpointsModificationTracker.incModificationCount()
    }

    companion object {
        fun getInstance(project: Project): GinModificationTrackersManager {
            return project.getService(GinModificationTrackersManager::class.java)
        }
    }
}

