package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(3,4,2,5,6);

        list.forEach(i->System.out.println(i));  //forEach is internal loop which comes from collection framework
                                                // which is faster than other for loops which are external



    }
}
