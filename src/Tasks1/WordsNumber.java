package Tasks1; /**
 * Created by pavlo.balyuk on 6/9/2017.
 */

import java.lang.String;

class WordsNumber {

    public static void main (String[] args) {
        String sentence = "Some test string to cont number of chars";
        String delimiter = " ";
        String sentenceArray[] = sentence.split(delimiter);
        System.out.print("Number of words is : " + (sentenceArray.length - 1));

    }
}