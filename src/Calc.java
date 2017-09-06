import java.util.Scanner;

/**
 * Created by Павлик&Иришка on 14.06.2017.
 */
public class Calc {

    public static void main (String[] args) {
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
            case ("add"):
                Calc.add(a, b);
                System.out.println(res);
                break;

            case ("subtract"):
                Calc.subtract(a, b);
                System.out.println(res);
                break;

            case ("multiply"):
                Calc.multiply(a, b);
                System.out.println(res);
                break;

            case ("divide"):
                Calc.divide(a, b);
                System.out.println(res);
                break;
        }
    }

    static double res;

    public static double add (double a, double b) {
        res = a + b;
        return res;
    }

    public static double subtract (double a, double b) {
        res = a - b;
        return res;
    }

    public static double multiply (double a, double b) {
        res = a * b;
        return res;
    }

    public static double divide (double a, double b) {
        res = a / b;
        return res;
    }
}
