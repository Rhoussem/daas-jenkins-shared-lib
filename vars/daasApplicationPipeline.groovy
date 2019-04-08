import daas.pipeline.config.PipelineConfig
import hudson.model. *
def call(Closure body) {
    PipelineConfig config

    pipeline {
        agent { node { label 'ubuntu-1604' } }
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
//                    when {
//                        expression { return config.ciConfig.codeBuildStage.enable }
//                    }
                        steps {
                            script {
                                codeBuild(config)
                            }
                        }
                    }
            stage("Unit & Integration tests ")
                    {
//                when {
//                    expression { return config.ciConfig.codeTestStage.enable }
//                }
                        steps {
                            script {
                                codeTest(config)
                            }
                        }
                    }
            stage("Dependencies check")
                    {
//            when {
//                expression{return config.ciConfig.codeSecurityStage.enable}
//            }
                        steps {
                            script {
                                dependencyCheck(config)
                            }
                        }
                    }
        }
    }
}