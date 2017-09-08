import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/6/2017.
 */
public class TasksOOP {
    /** Task 5.2.c Automation testing course here */
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
    /** Task 5.2.c Automation testing course here */

/**Task 5.3 Automation testing course here*/
        StudentImproved student1 = new StudentImproved();
        student1.setName("Ivan");
        StudentImproved student2 = student1;
        student2.name = "Petro";
        out.println(student1.name + "   " + student2.name);
/**Task 5.3 Automation testing course here*/
/**Task 5.4.a Automation testing course here*/
        student1.setName("Sam");
        student2.setName("Sam");
        out.println(student1.equals(student2));
/**Task 5.4.a Automation testing course here*/
/**Task 5.6.b Automation testing course here*/
        StudentImproved student = new StudentImproved();
        student.setName("Miguel");
        student.setSurname("Garcia");
        out.println(student.toString());
/**Task 5.6.b Automation testing course here*/
    }
}