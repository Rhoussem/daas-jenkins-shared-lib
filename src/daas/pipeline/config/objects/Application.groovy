// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline.config.objects

class Application implements Serializable {
	
	String id = ""
	String group = ""
	String name = ""
	String version = ""
	String branch = ""
	String latestCommit = ""
	// service or library
	String type = "service"
}