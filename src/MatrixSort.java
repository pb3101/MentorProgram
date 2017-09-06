import java.util.Arrays;

/**
 * Created by pavlo.balyuk on 6/19/2017.
 */
public class MatrixSort {
    public static void main(String[] args) {
        int matrix[] = {1, 6, 3, 3, 4, 5, 5, 6, 0};
            System.out.print("Массив після сортування: " + "\n");
        int arr[] = MatrixSort.removeDuplicates(matrix);
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("\n");
        int[] srt = MatrixSort.sort(matrix);
        System.out.print("Массив після сортування: " + "\n");
        for (int i = 0; i < srt.length; i++) {
            System.out.print(srt[i]);
        }
        System.out.println("\n");
    }
            public static int[] removeDuplicates(int[] matrix) {
            boolean mask[] = new boolean[matrix.length];
            int removeCount = 0;

            for (int i = 0; i < matrix.length; i++) {
                if (!mask[i]) {
                    int tmp = matrix[i];

                    for (int j = i + 1; j < matrix.length; j++) {
                        if (tmp == matrix[j]) {
                            mask[j] = true;
                            removeCount++;
                        }
                    }
                }
            }

            int[] result = new int[matrix.length - removeCount];

            for (int i = 0, j = 0; i < matrix.length; i++) {
                if (!mask[i]) {
                    result[j++] = matrix[i];
                }
            }

            return result;
        }
            public static int[] sort(int[] matrix){
            int[] matrix1 = MatrixSort.removeDuplicates(matrix);
            Arrays.sort(matrix1);
            /*for (int i= 0; i < matrix.length; i++)*/
            return matrix1;
    }
    }
