import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String args[]){

//        Predicate<T>
//        Represents a predicate (boolean-valued function) of one argument.

        Predicate<Integer> isEven = number-> number.intValue()%2==0;
        System.out.println("Predicate "+isEven.test(4));
        System.out.println("Predicate "+isEven.test(5));

//        Consumer<T>
//        Represents an operation that accepts a single input argument and returns no result.

        Consumer<String> printUpperCase = input ->  System.out.println("Consumer "+ input.toUpperCase());
        printUpperCase.accept("hello");

//        Function<T, R>
//        Represents a function that accepts one argument and produces a result.

        Function<String,Integer> stringLength = input -> input.length();
        System.out.println("Function "+ stringLength.apply("helo"));







    }
}
