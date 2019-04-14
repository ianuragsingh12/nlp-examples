package org.kingempire.nlp;

/**
 *
 * @author Anurag Singh
 */
public enum ModelPathEnum {

    EN_CHUNKER("C:\\few_tools\\apache-opennlp-models\\en-chunker.zip"),
    EN_NER_DATE("C:\\few_tools\\apache-opennlp-models\\en-ner-date.zip"),
    EN_NER_LOCATION("C:\\few_tools\\apache-opennlp-models\\en-ner-location.zip"),
    EN_NER_MONEY("C:\\few_tools\\apache-opennlp-models\\en-ner-money.zip"),
    EN_NER_ORGANIZATION("C:\\few_tools\\apache-opennlp-models\\en-ner-organization.zip"),
    EN_NER_PERCENTAGE("C:\\few_tools\\apache-opennlp-models\\en-ner-percentage.zip"),
    EN_NER_PERSON("C:\\few_tools\\apache-opennlp-models\\en-ner-person.zip"),
    EN_NER_TIME("C:\\few_tools\\apache-opennlp-models\\en-ner-time.zip"),
    EN_PARSER_CHUNKING("C:\\few_tools\\apache-opennlp-models\\en-parser-chunking.zip"),
    EN_POS_MAXENT("C:\\few_tools\\apache-opennlp-models\\en-pos-maxent.zip"),
    EN_POS_PERCEPTRON("C:\\few_tools\\apache-opennlp-models\\en-pos-perceptron.zip"),
    EN_SENT("C:\\few_tools\\apache-opennlp-models\\en-sent.zip"),
    EN_TOKEN("C:\\few_tools\\apache-opennlp-models\\en-token.zip");

    private final String path;

    ModelPathEnum(String path) {
        this.path = path;
    }

    public String path() {
        return path;
    }
}
