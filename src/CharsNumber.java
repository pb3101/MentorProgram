/**
 * Created by pavlo.balyuk on 6/9/2017.
 */

import java.util.*;
import java.lang.*;


public class CharsNumber {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ВВедіть стрічку; ");
        String sentense = input.next();
        String newSentense = sentense.replaceAll(" ", "");
        int size = 0;
        int charCount = 0;
        char temp;
       /* char delim = ' ';*/
        size = newSentense.length();
        /**One more loop needed to go throw delimiter*/
        for (int i = 0; i < size; i++) {
            temp = newSentense.charAt(i);
            if ( temp != ' ' )
                charCount++;
        }
        System.out.print("Кількість букв у введеній стрічці = " + charCount);
    }
}