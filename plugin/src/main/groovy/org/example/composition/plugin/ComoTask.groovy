package org.example.composition.plugin


import org.gradle.api.DefaultTask
import org.gradle.api.tasks.*
import org.gradle.work.InputChanges

public class ComoTask extends DefaultTask {

    ComoTask() {
        group = 'Test'
    }

    @TaskAction
    void execute(InputChanges inputs) {
        PluginMain.main()
    }

}
