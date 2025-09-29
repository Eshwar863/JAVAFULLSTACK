package org.example.Threads.Thread;
public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());  // Main thread

        Thread1 thread1 = new Thread1();  // Creates Thread1 object, but does not start a new thread yet.
        thread1.start();                  // Starts a new thread, internally calls run() in a separate thread.

        System.out.println(Thread.currentThread().getName());  // Still main thread

        Thread1 thread2 = new Thread1();  // Another Thread1 object
        thread2.start();                  // Starts a second thread
    }
}
