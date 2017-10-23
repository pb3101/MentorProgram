package Tasks7.Tasks72;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class Student {
    private String name;
    private String surname;
    private String dateOfCreation;
    Random random = new Random();
    int randomStudent = random.nextInt(1) + 10;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                '}';
    }

    protected String getName() {
        return name;
    }


    protected String getSurname() {
        return surname;
    }


    protected String getDateOfCreation() {
        return dateOfCreation;
    }

    static Builder newBuilder() {
        return new Student().new Builder();
    }

    class Builder {
        private  Builder() {
        }

        Builder setName() {
            Student.this.name = new StringBuilder().append("Student").append(randomStudent).toString();
            return this;
        }

        Builder setSurname(String surnameInput) {
            Student.this.surname = surnameInput;
            return this;
        }

        Builder setDateOfCreation() {

            Date date = new Date();
            String dateOfCreationInput = date.toString();
            Student.this.dateOfCreation = dateOfCreationInput;
            return this;
        }
        Student build() {
            return Student.this;
        }
    }
}
