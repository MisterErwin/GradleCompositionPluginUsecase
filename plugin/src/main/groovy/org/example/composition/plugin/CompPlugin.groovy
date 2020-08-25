package org.example.composition.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * This class realizes the plugin itself.
 * The plugin is only used to provide task type
 * MCTask  but no predefined task instances
 */
public class CompPlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.ext.ComoTask = ComoTask
        project.configurations.maybeCreate("grammar")
    }
}
