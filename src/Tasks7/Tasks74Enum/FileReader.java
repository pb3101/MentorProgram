package Tasks7.Tasks74Enum;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pavlo.balyuk on 10/11/2017.
 */

class FileReader {
    public static void main(String args[]) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY); // needed for handling exceptions on visibility of elements inside a class
//        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
//        StudentEnum.student = mapper.readValue(new File("studentsEnum.json"), Student[].class);
        List<Student> students = Arrays.asList(
                mapper.readValue(new File("studentsEnum.json"), Student[].class)
        );
        System.out.println(students);
    }
}