import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/6/2017.  From task 5.1 Automation testing course
 */
public class StudentImproved {
    /**Task 5.2 Automation testing course here*/
    public static void main(String args[]) {
        PhdStudent phdStudent = new PhdStudent();
        phdStudent.setName("Vasya");
        phdStudent.setSurname("Pupkin");
        phdStudent.enrollCourse();
        phdStudent.startStudy();
        phdStudent.finishStudy();
        phdStudent.getScore();
        phdStudent.defendThesis();
        phdStudent.graduate();

        MasterStudent masterStudent = new MasterStudent();
        masterStudent.setName("Vasya");
        masterStudent.setSurname("Pupkin");
        masterStudent.enrollCourse();
        masterStudent.startStudy();
        masterStudent.finishStudy();
        masterStudent.getScore();
        masterStudent.graduate();
        /**probably to take out to separate class*/
/**Task 5.3 Automation testing course here*/
        StudentImproved student1 = new StudentImproved();
        student1.setName("Ivan");
        StudentImproved student2 = student1;
        student2.name = "Petro";
        out.println(student1.name + "   " + student2.name);
/**Task 5.3 Automation testing course here*/
/**Task 5.4 Automation testing course here*/
        student1.setName("Sam");
        student2.setName("Sam");
        out.println(student1.equals(student2));
/**Task 5.4 Automation testing course here*/

    }

    /**Task 5.2 Automation testing course here*/
    String name;
    String surname;
    int age;

    /**Task 5.4 Automation testing course here*/
    boolean equals(StudentImproved student) {
        if ( student.name.equals(student.name) ){
            return true;
        }
        return false;
    }
    /**Task 5.4 Automation testing course here*/
    /**Task 5.5 Automation testing course here*/
    StudentImproved (String nameInput) {
        name = nameInput;
    }
    StudentImproved (StudentImproved studentInput) {
        studentInput = new StudentImproved() ;
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

