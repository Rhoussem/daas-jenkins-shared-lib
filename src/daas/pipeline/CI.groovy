// src/ca/bc/gov/iamp/pipeline

package ca.bc.gov.iamp.pipeline

class CI implements Serializable {
	
	Engine build = new Engine()
	Engine test = new Engine()
	Engine codeQuality = new Engine()
	Engine codeSecurity = new Engine()
	Engine archive = new Engine()

}