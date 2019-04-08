package ca.bc.gov.iamp.pipeline.config.ci.stages

import ca.bc.gov.iamp.pipeline.config.objects.Stage

class CodeArchiveStage extends Stage implements Serializable {

    boolean enable = false
    String id = "archive"
    String name = ""
    String engine = "maven"
    String credentials = "iamp-nexus"

    CodeArchiveStage() {
        // Stage vars
        this.enable = true
        this.id = "archive"
        this.name = "Archive"

        this.engine = "maven"
        this.goals = "deploy"
        this.params = "-DskipTests=true"
        this.credentials = "iamp-jenkins-nexus"
    }
}
