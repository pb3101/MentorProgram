package Tasks6.Task632;

import Interfaces.IMyString;

/**
 * Created by pavlo.balyuk on 10/7/2017.
 */
class MyString implements IMyString {

    IMyString iMyString;

    public MyString() {

    }

    public MyString(IMyString iMyString) {
        this.iMyString = iMyString;
    }

    @Override
    public String capitalyzeSymbols(String string) {
        return string.toUpperCase();
    }
}
