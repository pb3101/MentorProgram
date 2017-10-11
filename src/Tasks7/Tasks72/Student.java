package Tasks7.Tasks72;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class Student {
    private String name;
    private String surname;
    private String dateOfCreation;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                '}';
    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


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

        Builder setName(String nameInput) {
            Student.this.name = nameInput;
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
