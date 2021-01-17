package com.github.hl1033950430.ideaplugingworkplan.services

import com.github.hl1033950430.ideaplugingworkplan.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
