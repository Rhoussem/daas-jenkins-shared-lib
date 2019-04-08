package ca.bc.gov.iamp.pipeline.config.cd.stages

import ca.bc.gov.iamp.pipeline.config.objects.OcpDeployment
import ca.bc.gov.iamp.pipeline.config.objects.Template

class OcpProdDeployment extends OcpDeployment implements Serializable {

    OcpProdDeployment() {
        super()

        this.project = "ag-pssg-is-prod"
        this.imageTag = '${config.app.version}'

        this.env = "prod"
        this.replicas = 2

        // Test params
        this.testing.enable = false
    }
}
