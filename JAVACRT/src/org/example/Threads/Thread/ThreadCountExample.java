package org.example.Threads.Thread;

public class ThreadCountExample {
//    public static void main(String[] args) {
//        System.out.println("Active threads count at start: " + Thread.activeCount());
//
//        // Create some threads
//        Thread t1 = new Thread(() -> {
//            try { Thread.sleep(2000); } catch (InterruptedException e) {}
//        });
//        Thread t2 = new Thread(() -> {
//            try { Thread.sleep(2000); } catch (InterruptedException e) {}
//        });
//
//        t1.start();
//        t2.start();
//
//        System.out.println("Active threads count after starting threads: " + Thread.activeCount());
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Active threads count after threads finish: " + Thread.activeCount());
//    }

        public static void main(String[] args) {
            // Get the current thread group
            ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();

            // Get the number of active threads in this thread group and its subgroups
            int activeThreadCount = currentGroup.activeCount();
            System.out.println("Active Threads: " + activeThreadCount);
        }


}

