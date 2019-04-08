#!/usr/bin/groovy
import daas.pipeline.config.PipelineConfig

def call(PipelineConfig config) {

    println("Init Maven")

    sh "cp -f $WORKSPACE/${config.ciConfig.codeBuildStage.configDir}/maven-settings.xml /home/jenkins/.m2/settings.xml"
}