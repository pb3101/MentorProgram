package Tasks6.Task61;

/**
 * Created by pavlo.balyuk on 10/2/2017.
 */
class CalcSingleton {

    private static CalcSingleton instance = null;

    protected CalcSingleton() {

    }

    public static CalcSingleton getInstance() {
        if (instance == null) {
            instance = new CalcSingleton();
        }
        return instance;
    }


    protected static double add(double a, double b) {
        return a + b;
    }

    protected static double subtract(double a, double b) {
        return a - b;
    }

    protected static double multiply(double a, double b) {
        return a * b;
    }

    protected static double divide(double a, double b) throws ArithmeticException {
        if (b == 0.0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}