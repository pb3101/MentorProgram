import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/6/2017.  From task 5.1 Automation testing course
 */
public class StudentImproved {

    String name;
    String surname;
    int age;

    /**Task 5.6.a Automation testing course here*/
    public String toString(){
        return this.getName() + this.getSurname()+  "@" + Integer.toHexString(hashCode());
    }
    /**Task 5.6.a Automation testing course here*/

    /**Task 5.4.b Automation testing course here*/
    boolean equals(StudentImproved student) {
        return student.name.equals(student.name);
    }
    /**Task 5.4.b Automation testing course here*/

    /**Task 5.5 Automation testing course here*/
    StudentImproved() {
    }

    StudentImproved (String nameInput) {
        name = nameInput;
    }
    StudentImproved (StudentImproved studentInput) {
       StudentImproved student = studentInput;
    }
    /**Task 5.5 Automation testing course here*/

    void enrollCourse() {
        out.println("Student " + name + " " + surname + " enrolled the course");
    }

    void startStudy() {
        out.println("Student's " + name + " " + surname + " study started");
    }

    void finishStudy() {
        out.println("Student's " + name + " " + surname + " study finished");
    }

    void getScore() {
        out.println("Student " + name + " " + surname + " get 100 score");
    }

    public String setName(String nameInput) {
        return name = nameInput;
    }

    public String getName() {
        return name;
    }

    public String setSurname(String surnameInput) {
        return surname = surnameInput;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int ageInput) {
        return age = ageInput;
    }
}

