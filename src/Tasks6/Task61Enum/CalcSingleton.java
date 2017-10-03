package Tasks6.Task61Enum;


/**
 * Created by pavlo.balyuk on 10/2/2017.
 */
enum CalcSingleton {

    instance;

    //private final Connection conection;

    CalcSingleton() {
       // conection = DB.getConnection;
    }

    public static CalcSingleton getInstance() {

        return instance;
    }

    public void getConection() {
        //return null;
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