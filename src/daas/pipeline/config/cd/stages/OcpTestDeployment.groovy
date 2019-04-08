package ca.bc.gov.iamp.pipeline.config.cd.stages

import ca.bc.gov.iamp.pipeline.config.objects.OcpDeployment
import ca.bc.gov.iamp.pipeline.config.objects.Template

class OcpTestDeployment extends OcpDeployment implements Serializable {

    OcpTestDeployment() {
        super()

        this.project = "ag-pssg-is-test"
        this.imageTag = '${config.app.version}'

        this.env = "test"
        this.replicas = 2

        // Test params
        this.testing.enable = true
        this.testing.id = "load-testing"
        this.testing.name = "Load Testing"
        this.testing.engine = "maven"
        this.testing.goals = "loadtest"
    }
}
