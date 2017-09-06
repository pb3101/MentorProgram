/**
 * Created by pavlo.balyuk on 6/9/2017.
 */

import java.lang.String;

public class WordsNumber {

    public static void main( String[] args ) {
        String sentence = "Some test string to cont number of chars";
        String delimeter = " ";
        String sentenseArray[] = sentence.split( delimeter );
        System.out.print( "Number of words is : " + ( sentenseArray.length - 1 ) );

    }
}