package Tasks7.Tasks71;

import com.sun.org.apache.xpath.internal.operations.String;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class Student {
    private String name;
    private String surname;
    private String dateOfCreation;

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

    protected String setDateOfCreation(String dateOfCreationInput) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dateOfCreation = dateOfCreationInput;
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        return dateOfCreation;
    }
    protected String getDateOfCreation() {
        return dateOfCreation;
    }
}
