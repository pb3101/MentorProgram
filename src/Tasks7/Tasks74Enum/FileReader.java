package Tasks7.Tasks74Enum;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by pavlo.balyuk on 10/24/2017.
 */
class FileReader {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // needed for handling exceptions on visibility of elements inside a class

        Student[] students;
        students = mapper.readValue(new File("studentsEnum.json"), Student[].class);

        System.out.println(students[0]);
    }
}