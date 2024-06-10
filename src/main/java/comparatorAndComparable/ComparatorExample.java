package comparatorAndComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

//sort  on the basis of integer at last digit
public class ComparatorExample {

    static Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
           if(o1%10 > o2%10)
               return 1;                                            // return 1 means, it will swap these 2 elements
           else
               return -1;
        }
    };

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(34,43,25,51,69);
//        Collections.sort(list);
//        System.out.println(list);
        Collections.sort(list, comparator);
        System.out.println(list);
    }

}
