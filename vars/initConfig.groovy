#!/usr/bin/groovy
import daas.pipeline.config.PipelineConfig

def call(PipelineConfig config) {

    println("Init Config")

    // Get external config repo
    gitCheckout repoURL: config.ExternalConfigRepo.repoUrl, branch: config.ExternalConfigRepo.branch, directory: config.ExternalConfigRepo.localDir, credentialsId: config.ExternalConfigRepo.credentials

    // Init build engines
    initBuildEngine(config)
}