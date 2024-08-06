package streams;

import jdk.nashorn.internal.runtime.regexp.RegExp;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//filter out words which starts with vowel in caps
public class StringManipulation {


    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Aed", "Green", "Ulue", "Pink", "Orown");
        List list =colors.stream().filter(i->i.matches("^[aeiouAEIOU].*")).map(String::toUpperCase).collect(Collectors.toList());



        System.out.println(list);

    }

}
