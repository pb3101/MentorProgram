import java.util.Scanner;

/**
 * Created by pavlo.balyuk on 6/22/2017.
 */
public class CalcClass{

    public static void main(String[] agrs) {
        Calculator res = new Calculator();
        res.results();
        }

    public static class Calculator {
        public void results(){
            Scanner operation_input = new Scanner(System.in);
            String operation;
            System.out.println("Enter required operation name: add, subtratc, multiply, divide");
            operation = operation_input.next();
            System.out.println(operation);

            System.out.println("Enter first element");
            Double a = Double.parseDouble(operation_input.next());


            System.out.println("Enter second element");
            Double b = Double.parseDouble(operation_input.next());

            switch (operation)
            {
                case ("add"): add(a,b);
                    System.out.println(res);
                    break;

                case ("subtract"): subtract(a,b);
                    System.out.println(res);
                    break;

                case ("multiply"): multiply(a,b);
                    System.out.println(res);
                    break;

                case ("divide"): divide(a,b);
                    System.out.println(res);
                    break;
            }
        }

        double res;

        public double add(double a, double b)
        {
            res = a + b;
            return res;
        }

        public double subtract(double a, double b)
        {
            res = a - b;
            return res;
        }

        public double multiply(double a, double b)
        {
            res = a * b;
            return res;
        }

        public double divide(double a, double b)
        {
            res = a / b;
            return res;
        }
    }
}
