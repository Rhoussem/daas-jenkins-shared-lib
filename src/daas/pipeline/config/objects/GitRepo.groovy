// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config.objects

class GitRepo implements Serializable {
	
	String repoUrl
	String branch
	String credentials
	String localDir
}