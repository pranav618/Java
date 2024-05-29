package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//        Write a Java program to calculate the average of a list of integers using streams.


public class CalculateAverageStreamAPI {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(2,4,6,7,8,2);
        //2 ways , using lambda expression and using method reference
        double sum = list.stream().mapToDouble(d-> Double.valueOf((d))).average().orElse(0.0);
        double sum2 = list.stream().mapToDouble(Double::valueOf).average().orElse(0.0);
//        OptionalDouble sum3 = list.stream().mapToDouble(Double::valueOf).average();
        Double avg= Double.valueOf(sum2/ (list.size()));
        System.out.println(String.format("%.2f",avg));


    }
}
