package com.github.pandaniel.idiotsandwich.services

import com.github.pandaniel.idiotsandwich.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
