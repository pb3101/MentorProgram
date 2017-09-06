import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Павлик&Иришка on 14.06.2017.
 */
public class Reverse {

    public static void main( String args[] ) {
        double[] old = {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        Reverse r = new Reverse( );
        double[] rev = r.reverseArray( old );
        for (int i = rev.length - 1; i >= 0; i--) {
            System.out.println( rev[i] );
        }
    }

    public static double[] reverseArray( double[] arr ) {
        for (int i = arr.length - 1; i >= 0; i--) {
            double temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
}
