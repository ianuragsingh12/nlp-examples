package org.kingempire.nlp;

import java.io.IOException;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.Span;

/**
 *
 * @author Anurag Singh
 */
public class NewClass {

    public static void main(String[] args) throws IOException {
        NewClass o = new NewClass();
        o.f1();
    }

    public void f1() throws IOException {
        NLPObjects o = new NLPObjects();

        String sentence = " Hi. How are you? Welcome to Tutorialspoint. "
                + "We provide free tutorials on various technologies";

        SentenceDetectorME detector = o.getSentenceDetectorMEObj();

        System.out.println("==================Sentence Detection");

        String[] splitString2 = detector.sentDetect(sentence);

        for (String string : splitString2) {
            System.out.println(string);
        }
        System.out.println("==================Detecting the Positions of the Sentences");

        Span[] spans = detector.sentPosDetect(sentence);

        for (Span span : spans) {
            System.out.println(span);
        }
        System.out.println("==================Sentences along with their Positions");

        for (Span span : spans) {
            System.out.println(sentence.substring(span.getStart(), span.getEnd()) + " " + span);
        }
        System.out.println("==================Sentence Probability Detection");

        //Getting the probabilities of the last decoded sequence       
        double[] probs = detector.getSentenceProbabilities();
        for (int i = 0; i < probs.length; i++) {
            System.out.println(probs[i]);
        }

        System.out.println("==================SimpleTokenizer");

        //Instantiating SimpleTokenizer class 
        SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;

        //Tokenizing the given sentence 
        String tokens[] = simpleTokenizer.tokenize(sentence);

        //Printing the tokens 
        for (String token : tokens) {
            System.out.println(token);
        }
        System.out.println("==================WhitespaceTokenizer");
        //Instantiating whitespaceTokenizer class 
        WhitespaceTokenizer whitespaceTokenizer = WhitespaceTokenizer.INSTANCE;

        //Tokenizing the given paragraph 
        String tok[] = whitespaceTokenizer.tokenize(sentence);

        //Printing the tokens 
        for (String token : tok) {
            System.out.println(token);
        }
        System.out.println("==================TokenizerME");

        TokenizerME tme = o.getTokenizerMEObj();

        //Tokenizing the given raw text 
        String t1[] = tme.tokenize(sentence);

        //Printing the tokens  
        for (String a : t1) {
            System.out.println(a);
        }
        System.out.println("==================Tokenizer Probability");
        //Retrieving the positions of the tokens 
        Span t2[] = tme.tokenizePos(sentence);

        //Getting the probabilities of the recent calls to tokenizePos() method 
        double[] probs1 = tme.getTokenProbabilities();

        //Printing the spans of tokens 
        for (Span token : t2) {
            System.out.println(token + " " + sentence.substring(token.getStart(), token.getEnd()));
        }
        System.out.println("  ");
        for (int i = 0; i < probs1.length; i++) {
            System.out.println(probs1[i]);
        }
        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");

    }

    private String[] getDetectedSentences_RE(String sentence) {
        String simple = "[.?!]";
        return sentence.split(simple);
    }
}
