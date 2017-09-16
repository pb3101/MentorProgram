package Tasks3;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by pavlo.balyuk on 9/13/2017.
 * Implement application to work with a list. In the 1st half of the list replace all elements E1 with E2
 */
public class ListReplace {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        out.print(ListReplace.getListReplace(arrayList));
    }

    private static List getListReplace(List arrayList) {
        int i = 0;
        for (int j = arrayList.size(); j >= arrayList.size() / 2; j--) {
            arrayList.set(i, arrayList.get(j-1));
            i++;
        }
            return arrayList;
    }
}