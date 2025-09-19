package org.example.MultiThreading;

public class Threads implements Runnable{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
        /// multiple start() will lead to IllegalthreadstateException
    }

}
