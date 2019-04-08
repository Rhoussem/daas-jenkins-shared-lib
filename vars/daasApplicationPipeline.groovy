import daas.pipeline.config.PipelineConfig
import hudson.model. *

PipelineConfig config

pipeline {
    agent { node { label 'maven'} }
    stages {
        stage("Init pipeline")
                {
                    steps {
                        script {
                            initPipeline(config)
                        }
                    }

                }
        stage("Init config")
                {
                    steps {
                        script {
                            initConfig(config)
                        }
                    }

                }
        stage("Build")
                {
                    when {
                        expression { return config.ciConfig.codeBuildStage.enable }
                    }
                    steps {
                        script{
                            codeBuild(config)
                        }
                    }
                }
        stage("Unit & Integration tests ")
                when {
                    expression { return config.ciConfig.codeTestStage.enable }
                }
                steps {
                    script {
                        codeTest(config)
                    }
                }
        stage("Dependencies check")
            when {
                expression{return config.ciConfig.codeSecurityStage.enable}
            }
            steps {
                script {
                    dependencyCheck(config)
                }
            }
    }
}