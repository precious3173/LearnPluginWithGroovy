package com.precious.plugin.learnplugin

import org.gradle.api.provider.Property

import javax.inject.Inject
import javax.naming.spi.ObjectFactory

class FileExtension {

    final  Property<File> file1
    final  Property<File> file2

    @Inject
    FileExtension(ObjectFactory objectFactory){
     file1 = objects.property(File)
        file2 = objects.property(File)
    }
}
