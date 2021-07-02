package com.github.admin08.xsyxhelp.services

import com.github.admin08.xsyxhelp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
