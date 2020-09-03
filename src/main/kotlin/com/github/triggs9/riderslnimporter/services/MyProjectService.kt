package com.github.triggs9.riderslnimporter.services

import com.intellij.openapi.project.Project
import com.github.triggs9.riderslnimporter.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
