package Tasks7.Tasks73;
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
        private Builder() {
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
            Student.this.dateOfCreation = String.valueOf(new Date());
            return this;
        }

        Student build() {
            return Student.this;
        }
    }
}