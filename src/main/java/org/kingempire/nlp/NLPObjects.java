package org.kingempire.nlp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;

/**
 *
 * @author Anurag Singh
 */
public class NLPObjects {

    protected SentenceDetectorME getSentenceDetectorMEObj() throws FileNotFoundException, IOException {

        //Loading sentence detector model 
        try (InputStream inputStream = new FileInputStream(ModelPathEnum.EN_SENT.path())) {
            SentenceModel model = new SentenceModel(inputStream);

            //Instantiating the SentenceDetectorME class 
            SentenceDetectorME detector = new SentenceDetectorME(model);
            return detector;
        }
    }

    protected NameFinderME getNameFinderMEObj() throws IOException {

        //Loading the NER - Person model
        try (InputStream inputStream = new FileInputStream(ModelPathEnum.EN_NER_PERSON.path())) {
            TokenNameFinderModel model = new TokenNameFinderModel(inputStream);

            //Instantiating the NameFinder class 
            NameFinderME nameFinder = new NameFinderME(model);
            return nameFinder;
        }
    }

    protected TokenizerME getTokenizerMEObj() throws IOException {

        //Loading the Tokenizer model
        try (InputStream inputStream = new FileInputStream(ModelPathEnum.EN_TOKEN.path())) {
            TokenizerModel tokenModel = new TokenizerModel(inputStream);

            //Instantiating the TokenizerME class 
            TokenizerME tokenizer = new TokenizerME(tokenModel);
            return tokenizer;
        }
    }
}
