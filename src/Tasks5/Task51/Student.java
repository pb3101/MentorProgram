package Tasks5.Task51;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class Student {

    private String name;
    private String surname;

    protected void enrollCourse() {
        out.println("Tasks4.Student " + name + " " + surname + " enrolled the course");
    }

    protected void startStudy() {
        out.println("Tasks4.Student's " + name + " " + surname + " study started");
    }

    protected void finishStudy() {
        out.println("Tasks4.Student's " + name + " " + surname + " study finished");
    }

    protected void getScore() {
        out.println("Tasks4.Student " + name + " " + surname + " get 100 score");
    }

    protected void graduate() {
        System.out.println("Tasks4.Student " + name + surname + " is graduated ");
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
}