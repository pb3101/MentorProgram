package Tasks7.Tasks74;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;

/**
 * Created by pavlo.balyuk on 10/11/2017.
 */
public class FileReader {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // needed for handling exceptions on visibility of elements inside a class

        Student[] students;
        students = mapper.readValue(new File("students.json"), Student[].class);

        System.out.println(students[0]);
    }
}