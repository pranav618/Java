package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class SumEvenOddStream {

    public static void main(String[] args) {
        List< Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12, 14);

        Integer evenSum = numbers.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
        Integer oddSum = numbers.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();

        Optional<Integer> max = numbers.stream().max(Comparator.comparingInt(i -> i));  // to find the max
//
//        Optional<Integer> max2 = numbers.stream().max(Integer::compare);   // to find the max

        System.out.println(evenSum+" "+ max.get());

    }
}
