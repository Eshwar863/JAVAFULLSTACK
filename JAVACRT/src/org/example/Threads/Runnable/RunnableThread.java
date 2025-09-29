package org.example.Threads.Runnable;

    class RunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable thread is running");
            System.out.println(Thread.currentThread().getName());
        }
    }

    class Main {
        public static void main(String[] args) {
            RunnableThread runnable = new RunnableThread();       // Create Runnable instance
            Thread thread = new Thread(runnable);          // Pass it to new Thread
            thread.start();                                // Start the thread
/**
 *     You create a new Thread object and pass your Runnable instance (task) to its constructor.
 *     This tells the Thread object: “Here is the task that you should run when you start.”
 *     Essentially, the new Thread acts as a wrapper around your Runnable task to provide thread control and lifecycle management.*/


///  here the actual logic is in run() of Runnable implimented class
            ///  so we are passing obj of runnable to Thread constructor
            /// Thread acts as Wrapper class for the Runnable and all methods in Thread can be used to perform operations
            System.out.println("Main thread: " + Thread.currentThread().getName());
        }
    }

