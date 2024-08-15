package multithreading.ExecutorService;

import java.util.Random;
import java.util.concurrent.*;

//must throw Exception
//it returns a value

public class CallableAndFuture {

    static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            System.out.println("Task =="+Thread.currentThread().getName());
            return new Random().nextInt();
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
       Future<Integer> future= executorService.submit(new Task());

        try {
            Integer result= future.get();
            System.out.println(result+" Future");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Thread Name "+Thread.currentThread().getName());

    }
}
