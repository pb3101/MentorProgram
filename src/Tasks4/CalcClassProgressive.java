package Tasks4;

import java.util.Scanner;

/**
 * Created by pavlo.balyuk on 6/22/2017.
 */
public class CalcClassProgressive {

    public static void main (String[] args){
        Calculator res = new Calculator();
        res.results();
    }

    public static class Calculator {
        public void results () {
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
                    System.out.println(add(a, b));
                    break;

                case ("-"):
                    System.out.println(subtract(a, b));
                    break;

                case ("*"):
                    System.out.println( multiply(a, b));
                    break;

                case ("/"):
                    System.out.println(divide(a, b));
                    break;
            }
        }

        public double add (double a, double b) {
            return a + b;
        }

        public double subtract (double a, double b) {
            return a - b;
        }

        public double multiply (double a, double b) {
            return a * b;
        }

        public static double divide (double a, double b) {
            return a / b;
        }
    }
}
