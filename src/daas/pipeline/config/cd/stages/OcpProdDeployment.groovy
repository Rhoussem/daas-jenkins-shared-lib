package daas.pipeline.config.cd.stages

import daas.pipeline.config.objects.OcpDeployment


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
