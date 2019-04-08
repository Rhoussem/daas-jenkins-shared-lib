package ca.bc.gov.iamp.pipeline.config.objects

class Template implements Serializable {

    String name
    String filePath
    String type
    Map<String, String> params
    String parsedParams
}
