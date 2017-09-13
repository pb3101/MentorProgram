package Tasks1;
import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/13/2017.
 */
public class WordIndex {
    public static void main(String[] args) {
        String sentence = "Some test string to cont number of chars";
        int i =2;
        WordIndex(sentence,i);
    }

    public static void WordIndex(String sentence, int i) {
        String delimiter = " ";
        String sentenceArray[] = sentence.split(delimiter);
        out.print(i + " "+ sentenceArray[i]);
    }
}