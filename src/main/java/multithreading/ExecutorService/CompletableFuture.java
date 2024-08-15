package multithreading.ExecutorService;


//public class CompletableFuture {
//    public static void main(String[] args) {
//        try
//        {
//            List<Integer> list = Arrays.asList(5,9,14);
//            list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num))).map(CompletableFuture->CompletableFuture.thenApply(n-
//                    >n*n)).map(t->t.join()).forEach(s->System.out.println(s));
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}


// We can achieve asynchronous microservice using @Async, CompletableFuture. By default microservices are synchronous microservice

class Mains {
    public static int amount = 0;

    public static class CompletableFuture extends Thread {

        public void run(){
            System.out.println("JI");

        }

    }

    public static void main(String[] args) {
        CompletableFuture thread = new CompletableFuture();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}