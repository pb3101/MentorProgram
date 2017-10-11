package Tasks4;

import java.util.*;

/**
 * Created by pavlo.balyuk on 8/29/2017.
 */
class MatrixSortCollection {
    public static void main (String[] args) {
        List<Integer> matrix = new ArrayList<>();
        List<Integer> matrix1 = new ArrayList<>();
        matrix.add(1);
        matrix.add(6);
        matrix.add(3);
        matrix.add(3);
        matrix.add(4);
        matrix.add(5);
        matrix.add(5);
        matrix.add(6);
        matrix.add(0);
        System.out.print("Array before operations: " + "\n" + matrix + "\n");

        for (Integer i : matrix) {
            if ( !matrix1.contains(i) )
                matrix1.add(i);
        }
        System.out.print("Array after removing duplicates:" + "\n" + matrix1 + "\n");
        Collections.sort(matrix1);
        System.out.print("Array after sorting:" + "\n" + matrix1 + "\n");
        System.out.print("Original array to control changes:" + "\n" + matrix + "\n");
    }
}