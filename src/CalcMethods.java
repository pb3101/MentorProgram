/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
public class CalcMethods {

    public static double add (double a, double b) {
        return a + b;
    }

    public static double subtract (double a, double b) {
        return a - b;
    }

    public static double multiply (double a, double b) {
        return a * b;
    }

    public static double divide (double a, double b) throws ArithmeticException {
        if ( b == 0.0 ) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
