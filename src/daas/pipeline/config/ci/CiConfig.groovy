// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config.ci

import ca.bc.gov.iamp.pipeline.config.ci.stages.CodeArchiveStage
import ca.bc.gov.iamp.pipeline.config.ci.stages.CodeBuildStage
import ca.bc.gov.iamp.pipeline.config.ci.stages.CodeQualityStage
import ca.bc.gov.iamp.pipeline.config.ci.stages.CodeSecurityStage
import ca.bc.gov.iamp.pipeline.config.ci.stages.CodeTestStage



class CiConfig implements Serializable {

    CodeBuildStage codeBuildStage = new CodeBuildStage()
    CodeTestStage codeTestStage = new CodeTestStage()
    CodeQualityStage codeQualityStage = new CodeQualityStage()
    CodeSecurityStage codeSecurityStage = new CodeSecurityStage()
    CodeArchiveStage codeArchiveStage = new CodeArchiveStage()
}