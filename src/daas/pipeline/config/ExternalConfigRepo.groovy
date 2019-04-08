// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config

class ExternalConfigRepo implements Serializable {

	String repoUrl = "" //application github URL
	String branch = "master"
	String credentials = "jenkins_credentials" //we should impliment the jenkins account for github
	String localDir = "external-config"

	String latestCommit = ""
}