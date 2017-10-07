package Tasks6.Task632;

import Interfaces.IMyString;

/**
 * Created by pavlo.balyuk on 10/7/2017.
 */
public class Main {
    public static void main(String args[]) {
        IMyString iMyString = new MyString();
        System.out.println(iMyString.capitalyzeSymbols("lowercase"));
    }
}
