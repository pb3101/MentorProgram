package Tasks2;

import java.util.Scanner;

/**
 * Created by Павлик&Иришка on 14.06.2017.
 */
class NameX {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value");
        int x = in.nextInt();
        String name = "Pavlo";
        for (int i = 0; i < x; i++) {
            System.out.println('"' + name + '"');
        }

    }
}
