package org.example.MultiThreading;

public class SharedResources {
    synchronized void waitExample(){
        System.out.println(Thread.currentThread().getName());
        try{
            wait();
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
    /// wwithin the synchronized only one thread at a time can be accessed

    public static void main(String[] args) {
        /// here outside of Synchronized as many threads can be executed
    }
}
