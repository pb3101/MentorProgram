/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
public class HelloStundent {
    public static void main (String[] args) {
        Student student = new Student("Vasya", "Pupkin");
        System.out.println(student.getName());
        Student student1 = new Student("Petya", "Pupkin", 17);
        System.out.println(student1.getAge());
    }
}
