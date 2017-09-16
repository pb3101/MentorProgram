package Tasks1;

/**
 * Created by pavlo.balyuk on 9/13/2017. Task 1.4. Divide the same example to function: 1st parameter - text, second parameter: word index
 */
public class WordIndex {
    private static String getWordIndex(String sentence, int i) {
        String delimiter = " ";
        String sentenceArray[] = sentence.split(delimiter);
        int charCount = sentenceArray[i-1].length();
        return ("Number of chars in word '" +  sentenceArray[i-1] + "' " + "with index '" + String.valueOf(i) + "' is '" + charCount + "' \n");
    }
}