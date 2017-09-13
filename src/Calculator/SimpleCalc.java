package Calculator; /**
 * Created by pavlo.balyuk on 6/9/2017.
 */

import java.util.Scanner;

public class SimpleCalc {
    public static void main (String[] arg) {
        Scanner operation_input = new Scanner(System.in);
        String operation;
        System.out.println("Enter required operation name: add, subtratc, multiply, divide");
        operation = operation_input.next();
        System.out.println(operation);

        System.out.println("Enter first element");
        Double a = Double.parseDouble(operation_input.next());


        System.out.println("Enter second element");
        Double b = Double.parseDouble(operation_input.next());

        Double res;

        switch (operation) {
            case ("add"):
                res = a + b;
                System.out.println(res);
                break;
            case ("subtratc"):
                res = a - b;
                System.out.println(res);
                break;
            case ("multiply"):
                res = a * b;
                System.out.println(res);
                break;
            case ("divide"):
                res = a / b;
                System.out.println(res);
                break;
        }
    }
}
