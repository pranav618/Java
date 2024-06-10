package comparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//sort the string list on the basis of their length
public class ComparatorExample2 {

    static Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length() < o2.length())
                return 1;                                            // return 1 means, it will swap these 2 elements
            else
                return -1;
        }
    };

    public static void main(String[] args) {
        List<String> list = Arrays.asList("praanav","is","good","boi","nath","a");
//        Collections.sort(list);
//        System.out.println(list);
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
