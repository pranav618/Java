package code;



//we have an array of integers, we sum two number, then we replace those 2 numbers with the sum, we keep doing it until we have only 1 number left.
//        now we have to find the minimum sum in the end in java


import java.util.PriorityQueue;

public class myntraCodeInterviewRound {

    static int findMinSum(int[] arr){
        int sum=0;

        PriorityQueue<Integer> minHeap= new PriorityQueue<>();

        for(int n: arr){
            minHeap.add(n);
        }

        while(!minHeap.isEmpty()){
            int n1= minHeap.poll();
            if(!minHeap.isEmpty()){
                int n2= minHeap.poll();
                sum=n1+n2;
                minHeap.add(sum);
            }
            else {
                sum=n1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println("Minimum Sum: " + findMinSum(nums));
    }
}
