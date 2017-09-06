/**
 * Created by pavlo.balyuk on 6/19/2017.
 */

public class ReplaceValues {

    public static void main(String[] args){

        String arr[] = {"12", "23", "34", "12", "56", "67"};

           for (int i = 0; i < arr.length; i++){
               if ( arr[i] == "12" )
               {
                   arr [i] = "replaced";
               }
           }
           for (int j = 0; j < arr.length; j++) {
               System.out.println(arr[j]);
           }
    }
}
