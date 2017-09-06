/**
 * Created by pavlo.balyuk on 6/19/2017.
 */

import java.util.Scanner;


public class MatrixOfInts {
    public static void main (String[] args) {
        int data[][] = MatrixOfInts.fill();
        System.out.println("ВВедена матриця: " + "\n");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        int rev[][] = MatrixOfInts.reverse(data);
        System.out.print("Матриця після реверсу: " + "\n");
        for (int i = 0; i < rev.length; i++) {
            for (int j = 0; j < rev[i].length; j++) {
                System.out.print(rev[i][j] + "\t");
            }
            System.out.println();
        }
        int srt[][] = MatrixOfInts.removeDuplicatesSorted(data);
        System.out.print("Матриця після сортування: " + "\n");
        for (int i = 0; i < srt.length; i++) {
            for (int j = 0; j < srt[i].length; j++) {
                System.out.print(srt[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int row;
    static int column;

    public static int[][] fill () {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість стрічок массиву: ");
        row = in.nextInt();

        System.out.print("Введіть кількість стовбців массиву: ");
        column = in.nextInt();

        int[][] matrix = new int[row][column];
        for (row = 0; row < matrix.length; row++)
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print("Введіть елемент матриці[" + row + "][" + column + "]:");
                matrix[row][column] = in.nextInt();
            }
        return matrix;
    }

    public static int[][] reverse (int data[][]) {
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data[j].length / 2; i++) {
                int temp = data[j][i];
                data[j][i] = data[j][data[j].length - i - 1];
                data[j][data[j].length - i - 1] = temp;
            }
        }
        return data;
    }

    public static int[][] removeDuplicatesSorted (int data[][]) {

        /* Saving the 2D Array into a 1D Array */
        int[][] srt = MatrixOfInts.reverse(data);
        int B[] = new int[row * column]; //creating a 1D Array of size 'r*c'
        int x = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                B[x] = srt[i][j];
                x++;
            }
        }
            /*Sorting the 1D Array in Ascending Order*/

        int t;
        for (int i = 0; i < (row * column) - 1; i++) {
            for (int j = i + 1; j < (row * column); j++) {
                if ( B[i] > B[j] ) {
                    t = B[i];
                    B[i] = B[j];
                    B[j] = t;
                }
            }
        }
            /*Saving the sorted 1D Array back into the 2D Array */
        x = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                srt[i][j] = B[x];
                x++;
            }
        }
        return srt;
            /* Printing the sorted 2D Array */
    }
}