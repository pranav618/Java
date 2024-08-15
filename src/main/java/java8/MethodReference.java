package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(3,4,2,5,6);

        list.forEach(i->System.out.println(i));         //printing using lambda expression

        list.forEach(System.out::println);               //printing using method reference



    }



}
