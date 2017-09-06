import java.util.*;

/**
 * Created by pavlo.balyuk on 9/4/2017.
 */
public class MatrixSortHashSetImproved {
    public static void main( String[] args ) {
        List<Integer> matrix = new ArrayList( );
        matrix.add( 1 );
        matrix.add( 6 );
        matrix.add( 3 );
        matrix.add( 3 );
        matrix.add( 4 );
        matrix.add( 5 );
        matrix.add( 5 );
        matrix.add( 6 );
        matrix.add( 0 );
        for (Integer e : matrix) {
            if ( e == 3 ) {
                continue;
            }
            System.out.println( e );
        }
//Convert HashSet into list to sort elements and convert again into HashSet
        Set m = new HashSet( matrix ); // HashSet contains only unique values on adding
        System.out.print( "Original HashSet to control changes:" + "\n" + m + "\n" );
    }
}
