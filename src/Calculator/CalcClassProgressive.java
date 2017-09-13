package Calculator;

import java.util.Scanner;
import java.lang.Exception;

/**
 * Created by pavlo.balyuk on 6/22/2017.
 */
public class CalcClassProgressive {

    public static void main (String[] agrs) throws Exception {
        Calculator res = new Calculator();
        res.results();
    }

    public static class Calculator {
        double res;

        public void results () throws Exception {
            Scanner operation_input = new Scanner(System.in);
            String operation;
            System.out.println("Enter required operation name: add, subtratc, multiply, divide");
            operation = operation_input.next();
            System.out.println(operation);

            System.out.println("Enter first element");
            Double a = Double.parseDouble(operation_input.next());


            System.out.println("Enter second element");
            Double b = Double.parseDouble(operation_input.next());

            switch (operation) {
                case ("+"):
                    add(a, b);
                    System.out.println(res);
                    break;

                case ("-"):
                    subtract(a, b);
                    System.out.println(res);
                    break;

                case ("*"):
                    multiply(a, b);
                    System.out.println(res);
                    break;

                case ("/"):
                    divide(a, b);
                    System.out.println(res);
                    break;
            }
        }


        public double add (double a, double b) {
            res = a + b;
            return res;
        }

        public double subtract (double a, double b) {
            res = a - b;
            return res;
        }

        public double multiply (double a, double b) {
            res = a * b;
            return res;
        }

        public static double divide (double a, double b) throws Exception {
            return a / b;
        }
    }
}
