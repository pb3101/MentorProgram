package Tasks3;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * Created by pavlo.balyuk on 9/13/2017.
 */
public class Calculator {
    void results() {
        Scanner operation_input = new Scanner(in);
        String operation;
        out.println("Enter required operation name: add, subtratc, multiply, divide");
        operation = operation_input.next();

        out.println("Enter first element");
        Double a = Double.parseDouble(operation_input.next());

        out.println("Enter second element");
        Double b = Double.parseDouble(operation_input.next());

        switch (operation) {
            case ("add"):
                out.println(add(a, b));
                break;

            case ("subtract"):
                out.println(subtract(a, b));
                break;

            case ("multiply"):
                out.println(multiply(a, b));
                break;

            case ("divide"):
                out.println(divide(a, b));
                break;
        }
    }

    private double add(double a, double b) {
        return a + b;
    }

    private double subtract(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }
}

