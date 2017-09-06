import java.util.Random;

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
public class Student {

    String name;
    String surname;
    int age;

    Student (String nameInput, String surnameInput) {
        name = nameInput;
        surname = surnameInput;
        age = new Random().nextInt();
    }

    Student (String nameInput, String surnameInput, int ageInput) {
        name = nameInput;
        surname = surnameInput;
        age = ageInput;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public int setAge (int ageInput) {
        return age = ageInput;
    }

}

