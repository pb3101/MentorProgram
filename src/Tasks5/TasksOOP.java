package Tasks5;

import Interfaces.IChillable;
import Interfaces.IWorkable;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/6/2017.
 */
public class TasksOOP {
    /** Task 5.2.c Automation testing course here */
    public static void main(String args[]) {
        /*Tasks5.StudentImproved student3 = new Tasks5.PhdStudent("Petro","Petrenko");
        student3.graduate();
        Tasks5.StudentImproved student4 = new Tasks5.MasterStudent("Ivan","Ivanovuch");
        student4.graduate();
        */
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
    /** Task 5.2.c Automation testing course here */

/**Task 5.3 Automation testing course here*/
        StudentImproved student1 = new StudentImproved("Ivan");
        StudentImproved student2 = new StudentImproved(student1); //used copy constructor to copy properties from stundent1 to student 2
        //Tasks5.StudentImproved student2 = student1; (share resources with both objects. eg student1 and student2)
        student2.name = "Petro";
        out.println(student1.name + "   " + student2.name);
/**Task 5.3 Automation testing course here*/
/**Task 5.4.a Automation testing course here*/
        student1.setName("Sam");
        student2.setName("Sam");
        out.println(student1.equals(student2));
        out.println(student1 == student2);
/**Task 5.4.a Automation testing course here*/
/**Task 5.5.c and 5.5.d Automation testing course here*/
        StudentImproved student55a = new StudentImproved("Samuel");
        StudentImproved student55b = new StudentImproved(student55a);
        PhdStudent phdStudent1 = new PhdStudent(/*"Name", "Surname"*/student55b);
        out.println(student55a);
        out.println(student55b);
        out.println(phdStudent1);
/**Task 5.5.c and 5.5.d Automation testing course here*/
/**Task 5.6.b Automation testing course here*/
        StudentImproved student = new StudentImproved();
        student.setName("Miguel");
        student.setSurname("Garcia");
        out.println(student);
/**Task 5.6.b Automation testing course here*/
        IChillable chillable = student1;
        chillable = phdStudent;
        chillable.playGames();
        IWorkable workable = masterStudent;
        workable.work();
    }
}