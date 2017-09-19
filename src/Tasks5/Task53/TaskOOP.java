package Tasks5.Task53;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class TaskOOP {
    public static void main(String args[]) {
        Student student1 = new Student("Ivan");
        Student student2 = new Student(student1); //used copy constructor to copy properties from student1 to student2
        //Tasks5.StudentImproved student2 = student1; (share resources with both objects. eg student1 and student2)
        student2.name = "Petro";
        out.println(student1.name + "   " + student2.name);
    }
}