package org.example.MultiThreading;

public class Threads implements Runnable{
    @Override
    public void run() {
/// multiple start() will lead to IllegalthreadstateException
    }

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
        /// multiple start() will lead to IllegalthreadstateException
    }

}
