package Tasks4;

import java.util.*;

/**
 * Created by pavlo.balyuk on 9/4/2017.
 */
public class MatrixSortHashSet {
    public static void main (String[] args) {
        LinkedHashSet matrix = new LinkedHashSet();
        matrix.add(1);
        matrix.add(6);
        matrix.add(3);
        matrix.add(3);
        matrix.add(4);
        matrix.add(5);
        matrix.add(5);
        matrix.add(6);
        matrix.add(0);
        // HashSet contains only unique values on adding
        System.out.print("Original HashSet to control changes:" + "\n" + matrix + "\n");
        //Convert HashSet into list to sort elements and convert again into HashSet
        List<Integer> matrix1 = new ArrayList<Integer>(matrix);
        Collections.sort(matrix1);
        matrix.clear();
        matrix = new LinkedHashSet(matrix1);
        //Can be used new HashSet to save structure of old one
        System.out.print("Sorted HashSet to control changes:" + "\n" + matrix + "\n");
    }
}
