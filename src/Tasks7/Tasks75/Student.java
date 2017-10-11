package Tasks7.Tasks75;
import java.util.Date;

/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class Student {
    private String name;
    private String surname;
    private String dateOfCreation;
    private Gender gender;

    @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
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

            Date date = new Date();
            String dateOfCreationInput = date.toString();
            Student.this.dateOfCreation = dateOfCreationInput;
            return this;
        }
        Builder setGender(Gender genderInput){
            Student.this.gender = genderInput;
            return this;
        }

        Student build() {
            return Student.this;
        }
    }
}