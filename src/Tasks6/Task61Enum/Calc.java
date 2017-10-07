package Tasks6.Task61Enum;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 10/3/2017.
 */
class Calc {
    public static void main(String args[]) {
        CalcSingleton.getInstance();
        out.print(CalcSingleton.getInstance().add(1, 5) + " \n");
        out.print(CalcSingleton.getInstance().subtract(1, 5) + " \n");
        out.print(CalcSingleton.getInstance().divide(1, 5) + " \n");
        out.print(CalcSingleton.getInstance().multiply(1, 5) + " \n");
    }
}