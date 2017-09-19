package Tasks5.Task55;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class Student {
    protected String name;
    protected String surname;

    protected Student(String nameInput) {
        this.name = nameInput;
    }

    protected Student(Student student) {
        this.name = student.name;
        this.surname = student.surname;
    }
}
