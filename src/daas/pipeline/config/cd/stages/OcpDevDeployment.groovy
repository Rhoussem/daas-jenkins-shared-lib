package ca.bc.gov.iamp.pipeline.config.cd.stages

import ca.bc.gov.iamp.pipeline.config.objects.OcpDeployment
import ca.bc.gov.iamp.pipeline.config.objects.Template

class OcpDevDeployment extends OcpDeployment implements Serializable {

    OcpDevDeployment() {
        super()

        this.project = "ag-pssg-is-dev"
        this.env = "dev"

        // Test params
        this.testing.enable = true
        this.testing.id = "system-testing"
        this.testing.name = "System Testing"
        this.testing.engine = "maven"
        this.testing.goals = "test"

        // Auto scaling
        this.autoScaling.enable = false
    }
}
