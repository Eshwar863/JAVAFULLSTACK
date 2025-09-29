package org.example.Threads.Thread;

public class ThreadMethods extends Thread{
@Override
    public void run(){
    System.out.println("Thread is running");
    try {
        Thread.sleep(8000); /// sleeps for 8secs

    }catch (Exception e) {
        System.out.println(e);
        e.printStackTrace();
    }
    }
}


class Main{
    public static void main(String[] args) {
        ThreadMethods  threadMethods  = new ThreadMethods();
        threadMethods.start(); /// starts the thread
        System.out.println(threadMethods.getName()); /// returns name
        threadMethods.setName("ThreadMethod");  //// setting name of thread to "ThreadMethod"
        System.out.println(threadMethods.getName());  /// returns name of thread
        System.out.println(threadMethods.isAlive());


    }
}
