/**
 * Created by pavlo.balyuk on 6/22/2017.
 */
public class MinFind {
    public static void main (String[] args) {
        double[][] s = { { 5.0, 9.0, 3.0, 2.0, 0.0, 4.0, 8.3, 3.0, -9.0 }, { 2, 5, 2, 1, 6, 5, 1, 2, -9 } };
        double ave = 0;

        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s[i].length; j++) {
                ave += s[i][j];
            }
        double average = ave / s.length;
        double min = s[0][0];

        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s[i].length; j++) {
                if ( s[i][j] < min ) {
                    min = s[i][j];
                }
            }
        int x = 0;
        int z = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if ( s[i][j] == min ) {
                    x = i;
                    z = j;
                }
            }
        }

        s[x][z] = average; /**Something wrong with for loop or assign average to specific indexed position into matrix*/
        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s);
            }
    }
}

