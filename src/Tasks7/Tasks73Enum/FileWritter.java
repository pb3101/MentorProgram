package Tasks7.Tasks73Enum;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by pavlo.balyuk on 10/24/2017.
 */
public class FileWritter {
    public static void main(String args[]) throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // needed for handling exceptions on visibility of elements inside a class

        Student stud1 = Student.newBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setDateOfCreation()
                .setGender(Gender.Man)
                .build();

        Thread.sleep(1000);

        Student stud2 = Student.newBuilder()
                .setName("Petro")
                .setSurname("Petrov")
                .setDateOfCreation()
                .setGender(Gender.Man)
                .build();

        Thread.sleep(1000);

        Student stud3 = Student.newBuilder()
                .setName("Vasul")
                .setSurname("Vasuliev")
                .setDateOfCreation()
                .setGender(Gender.Man)
                .build();

        Student[] students = {stud1, stud2, stud3};

        mapper.writeValue(new File("studentsEnum.json"), students);

    }
}
