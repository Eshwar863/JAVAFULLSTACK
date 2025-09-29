package org.example.Assignment.RunnableAssignment;

public class MainClass implements RunnableClass{
    @Override
    public void run() {
        System.out.println("Running MainClass");
    }

    public static void main(String[] args) {
        MainClass  mainClass = new MainClass();
        ThreadClass threadClass =  new ThreadClass(mainClass);
        threadClass.start();
        threadClass.sleep();

    }
}
