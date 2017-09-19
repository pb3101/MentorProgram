package Tasks5.Task55;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class TaskOOP {
    public static void main(String args[]) {
        Student student1 = new Student("Samuel");
        Student student2 = new Student(student1);
        PhdStudent phdStudent1 = new PhdStudent(student2);
        out.println(student1.name);
        out.println(student2.name);
        out.println(phdStudent1.name);
    }
}