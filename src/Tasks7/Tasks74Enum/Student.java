package Tasks7.Tasks74Enum;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
public class Student {
    private String name;
    private String surname;
    private String dateOfCreation;
    
    public Student() {
        List<Student> students = Arrays.asList();
    }

    public Student(String name, String surname, String dateOfCreation) {
        this.name = name;
        this.surname = surname;
        this.dateOfCreation = dateOfCreation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String name) {
        this.dateOfCreation = dateOfCreation;
    }
}