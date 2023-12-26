package com.precious.plugin.learnplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class FileExtensionPlugin implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.extensions.create("file", FileExtensionTask)

        project.tasks.create("file")
    }
}
