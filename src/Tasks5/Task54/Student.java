package Tasks5.Task54;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class Student {
    protected String name;
    protected String surname;

    protected  Boolean equals(Student student) {
        return this.name == student.name && this.surname == student.surname;
    }


    protected String setName(String nameInput) {
        return name = nameInput;
    }

    protected String getName() {
        return name;
    }

}
