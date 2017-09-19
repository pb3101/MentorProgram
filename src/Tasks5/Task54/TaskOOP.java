package Tasks5.Task54;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class TaskOOP {
    public static void main(String args[]) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Sam");
        student2.setName("Sam");
        out.println(student1.equals(student2));
        out.println(student1 == student2);
    }
}