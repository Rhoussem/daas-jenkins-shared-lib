// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config.cd

import ca.bc.gov.iamp.pipeline.config.cd.stages.ContainerBuildStage
import ca.bc.gov.iamp.pipeline.config.cd.stages.OcpDevDeployment
import ca.bc.gov.iamp.pipeline.config.cd.stages.OcpProdDeployment
import ca.bc.gov.iamp.pipeline.config.cd.stages.OcpTestDeployment


class CdConfig implements Serializable {

    ContainerBuildStage containerBuildStage = new ContainerBuildStage()
    OcpDevDeployment ocpDevDeployment = new OcpDevDeployment()
    OcpTestDeployment ocpTestDeployment = new OcpTestDeployment()
    OcpProdDeployment ocpProdDeployment = new OcpProdDeployment()
}