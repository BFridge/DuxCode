package com.github.bfridge.duxcode.services

import com.github.bfridge.duxcode.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
