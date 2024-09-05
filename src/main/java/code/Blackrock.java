package code;

import java.util.*;

public class Blackrock {

    /*
     * Complete the 'kthOccurrence' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER_ARRAY arr
     *  3. INTEGER_ARRAY query_values
     */

//    Explanation of the Input:
//    𝑋
//=
//        2
//    X=2: We are looking for the k-th occurrences of the number 2 in the list arr.
//    arr = [1, 2, 3, 2, 2, 4, 2]: This is the list in which we are searching for the occurrences of 2.
//    query_values = [1, 2, 3, 4]: These are the queries asking for the 1st, 2nd, 3rd, and 4th occurrences of 2.

    static List<Integer> kthOccurrence(int X, List<Integer> arr, List<Integer> query_values) {
        HashMap<Integer, List<Integer>> hashMap= new HashMap<>();
        //map(number, list of number's index)
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==X){
                list.add(i);
                hashMap.put(arr.get(i),list);
            }
        }
        for(int k: query_values){
            list2.add(list.get(k-1));
        }
        System.out.println(list2);
        return list2;
    }

    public static void main(String[] args) {
        int X = 2;
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 2, 4, 2,3);
        List<Integer> query_values = Arrays.asList( 2, 3, 4);
        System.out.println("Solution" +kthOccurrence(X, arr, query_values));
    }
}