package Tasks7.Tasks73;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;



/**
 * Created by pavlo.balyuk on 10/10/2017.
 */
class FileWritter {
    public static void main(String args[]) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // needed for handling exceptions on visibility of elements inside a class

        Student stud1 = Student.newBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setDateOfCreation()
                .build();

        Student stud2 = Student.newBuilder()
                .setName("Petro")
                .setSurname("Petrov")
                .setDateOfCreation()
                .build();

        Student stud3 = Student.newBuilder()
                .setName("Vasul")
                .setSurname("Vasuliev")
                .setDateOfCreation()
                .build();

        Student[] students = {stud1, stud2, stud3};

        mapper.writeValue(new File("studentsEnum.json"), students);

    }
}
