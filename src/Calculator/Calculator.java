package Calculator;

import static java.lang.System.*;

/**
 * Created by pavlo.balyuk on 9/4/2017.
 */
class Calculator {
    public static void main (String[] args) throws Exception {
        //Class saves all calculator inputs except 'do {} while()' loop breaker
        CalcInput input = new CalcInput();
        //Class saves all calculator methods
        CalcMethods c = new CalcMethods();
        String action;
        String result = "\nResult: ";
        do {
            action = new CalcInput().inputOperation();

            try {
                if ( "q".equalsIgnoreCase(action) ) {
                    break;
                }
                double v1 = input.inputValue1();
                double v2 = input.inputValue2();
                switch (action) {
                    case ("+"):
                        out.println(result + c.add(v1, v2));
                        break;

                    case ("-"):
                        out.println(result + c.subtract(v1, v2));
                        break;

                    case ("*"):
                        out.println(result + c.multiply(v1, v2));
                        break;

                    case ("/"):
                        try {
                            out.println(result + c.divide(v1, v2));
                        } catch (ArithmeticException e) {
                            out.println("Zero division is not allowed");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                out.println("Entered value is not a number!");
            } catch (IllegalArgumentException e) {
                out.println(e + "Attempts to enter valid operations failed");
            }
        } while (true);
    }
}

