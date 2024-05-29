package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//arrange in ascending and descending order
public class AlphabeticalOrderStreamAPI {

    public static void main(String args[]){

        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");


        //Ascending Order
        List<String> ascendingOrder = colors.stream().sorted().collect(Collectors.toList());
        colors.stream().sorted().forEach(System.out::println);



        //Descending Order
        colors.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);




    }


}
