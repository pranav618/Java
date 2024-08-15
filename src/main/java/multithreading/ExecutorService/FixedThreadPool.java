package multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    static class Task implements Runnable{

        @Override
        public void run() {
            System.out.println("Task =="+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);

        for(int i=0;i<10;i++){
            executorService.execute(Task:: new);
        }
        System.out.println("Thread Name "+Thread.currentThread().getName());


    }
}
