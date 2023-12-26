package com.precious.plugin.learnplugin

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

//import org.gradle.api.provider.Property

abstract class FileExtensionTask extends DefaultTask{
    @InputFile
 final Property<File> file1
    @InputFile
    final Property<File> file2

    File resultFile = new File("${project.buildDir}/diff-result.txt")

    @TaskAction
    def diff(){
        String diffResult

        if(file1.get().size() == file2.get().size()){
            diffResult = "Files have the same size"
        }
        else{
            File largestFile = file1.get().size() > file2.get().size() ? file1.get() : file2.get()

            diffResult = "${largestFile.toString()} was the largest file at ${largestFile.size()} bytes"
        }

        resultFile.write diffResult
        println diffResult
    }
}