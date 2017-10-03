package Tasks5.Task56;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class Student {

    protected String name;
    protected String surname;

    public String toString() {
        return this.getName() + " " + this.getSurname() + " @" + Integer.toHexString(hashCode());
    }

    protected String setName(String nameInput) {
        return name = nameInput;
    }

    protected String getName() {
        return name;
    }

    protected String setSurname(String surnameInput) {
        return surname = surnameInput;
    }

    protected String getSurname() {
        return surname;
    }

    public final void doSMTN() {
    }
}
