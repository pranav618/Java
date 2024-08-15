package multithreading.deadlock;

public class DeadlockSolved {

    public static void main(String[] args) {
        final String resource1 = "pranav nath";
        final String resource2 = "shweta sharma";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread(()-> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try { Thread.sleep(100);} catch (Exception e) {}

                // Thread-1 have resource2 but need resource1 also
                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread(()->{
            synchronized (resource1) {
                System.out.println("Thread 2: locked resource 2");

                try { Thread.sleep(100);} catch (Exception e) {}

                // Thread-2 have resource2 but need resource1 also

                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }

}
