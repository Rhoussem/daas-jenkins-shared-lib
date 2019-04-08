// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config

import ca.bc.gov.iamp.pipeline.config.cd.CdConfig
import ca.bc.gov.iamp.pipeline.config.ci.CiConfig
import ca.bc.gov.iamp.pipeline.config.objects.Application

class PipelineConfig implements Serializable {

    String baseDir
    Application app = new Application()
    ExternalConfigRepo externalConfig = new ExternalConfigRepo()

    CiConfig ciConfig = new CiConfig()

    CdConfig cdConfig = new CdConfig()
}