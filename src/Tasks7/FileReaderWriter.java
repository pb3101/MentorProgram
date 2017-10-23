package Tasks7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pavlo.balyuk on 10/23/2017.
 */
public class FileReaderWriter {

    public static ArrayList<String> readFileToArrayList(String fileToRead) throws FileNotFoundException {
        File file = new File(fileToRead);
        ArrayList<String> students = new ArrayList<String>();
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            students.add(in.nextLine());
        }
        return students;
    }

    public static void writeArrayToArrayFile(String fileToWrite, ArrayList<String> arrayListToWrite) throws IOException {
        FileWriter fw = new FileWriter(fileToWrite);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : arrayListToWrite) {
            bw.write(s + "\n");
        }
        bw.close();
    }

    public static void pritnParsedFile(ArrayList<String> arrayListFromFile) {
        for (String s : arrayListFromFile) {
            System.out.println(s);
        }
    }
}
