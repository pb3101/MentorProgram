package Tasks7.Tasks75;

/**
 * Created by pavlo.balyuk on 10/11/2017.
 */
public class Main {
    public static void main(String args[]) {
        Student stud1 = Student.newBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setDateOfCreation()
                .setGender(Gender.Man)
                .build();
        System.out.println(stud1);
    }
}