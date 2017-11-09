package Tasks7.Tasks71;
import java.util.Date;

/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class Student {
    private String name;
    private String surname;
    private String dateOfCreation;

    Student(String nameInput,String surnameInput) {
        this.name = nameInput;
        this.surname = surnameInput;
        this.dateOfCreation = String.valueOf(new Date());
    }

    protected String setName(String nameInput) {
        return name = nameInput;
    }

    protected String getName() {
        return name;
    }

    protected String setSurname(String surnameInput) {
        return surname = surnameInput;
    }

    protected String getSurname() {
        return surname;
    }

    protected String getDateOfCreation() {
        return dateOfCreation;
    }
}
