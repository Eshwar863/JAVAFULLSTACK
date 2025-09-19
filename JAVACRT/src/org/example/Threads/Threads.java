package org.example.Threads;

public class Threads extends Thread{
    /**
     * By extending Thread
     * By implementing Runnable interface
     * Executors ----> threads will be created automatically by JVM.
     *
     * here Start() is used to start the thread will calls Run() method which is overriden
     * */


    /**
     * to achive multiple inheritance we use the Runnable interface
     * here
     * */

    @Override
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getName()+ " is running");
        }
        catch (Exception e){
            System.out.println("Exception is Caught");
        }
    }

    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.start(); // it will call the run();
    }
}
