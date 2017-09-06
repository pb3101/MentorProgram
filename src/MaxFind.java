/**
 * Created by Павлик&Иришка on 14.06.2017.
 */

public class MaxFind {

    public static void main (String[] args) {
        double[] s = { 5, 9, 3, 2, 0, -4, -8.3, 3, -4 };

        double i = s[0];
        for (int j = 0; j < s.length; j++) {
            if ( s[j] > i ) {
                i = s[j];
            }
        }
        System.out.print("Max number is = " + i + "\n");
    }
}
