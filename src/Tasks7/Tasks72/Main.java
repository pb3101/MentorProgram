package Tasks7.Tasks72;


/**
 * Created by pavlo.balyuk on 10/11/2017.
 */
public class Main {
    public static void main(String args[]) {

        Student stud1 = Student.newBuilder()
                .setName()
                .setSurname("Ivanov")
                .setDateOfCreation()
                .build();

        Student stud2 = Student.newBuilder()
                .setName()
                .setSurname("Petrov")
                .setDateOfCreation()
                .build();

        Student stud3 = Student.newBuilder()
                .setName()
                .setSurname("Vasuliev")
                .setDateOfCreation()
                .build();
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
    }
}
