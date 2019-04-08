
package daas.pipeline.config.cd

import daas.pipeline.config.cd.stages.ContainerBuildStage
import daas.pipeline.config.cd.stages.OcpDevDeployment
import daas.pipeline.config.cd.stages.OcpProdDeployment
import daas.pipeline.config.cd.stages.OcpTestDeployment


class CdConfig implements Serializable {

    ContainerBuildStage containerBuildStage = new ContainerBuildStage()
    OcpDevDeployment ocpDevDeployment = new OcpDevDeployment()
    OcpTestDeployment ocpTestDeployment = new OcpTestDeployment()
    OcpProdDeployment ocpProdDeployment = new OcpProdDeployment()
}