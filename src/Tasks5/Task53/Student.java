package Tasks5.Task53;


/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class Student {

    protected String name;
    protected String surname;

    protected Student(String nameInput) {
        this.name = nameInput;
    }

    protected Student(Student oldstudent) {
        this.name = oldstudent.name;
        this.surname = oldstudent.surname;
    }

    protected Student(String nameInput, String surnameInput) {
        name = nameInput;
        surname = surnameInput;
    }
}