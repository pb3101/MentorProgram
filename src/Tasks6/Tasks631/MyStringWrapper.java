package Tasks6.Tasks631;

import Interfaces.IMyString;

/**
 * Created by pavlo.balyuk on 10/3/2017.
 * Implement some MyString over String class, name it  MyString, add feature to show capital symbols in string: myString.capitalyzeSymbols().
 * Note:
 * Add constructor for String parameter and implement function: capitalyzeSymbols() which makes all symbols capital, e.g. food ->FOOD. In main function call this function to show it works.
 */
public class MyStringWrapper implements IMyString{
    String upperCaseText;

    MyStringWrapper(String lowerCaseText){
    }

    @Override
    public String capitalyzeSymbols(String lowerCaseText) {
        upperCaseText = lowerCaseText.toUpperCase();
        return upperCaseText;
    }
}
