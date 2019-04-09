

package daas.pipeline.config

class ExternalConfigRepo implements Serializable {

	String repoUrl = "git@github.com:opticca-consulting/daas-pipeline-config.git" //application github URL
	String branch = "develop"
	String credentials = "id1" //we should impliment the jenkins account for github
	String localDir = "external-config"

	String latestCommit = ""
}