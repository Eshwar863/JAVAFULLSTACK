package org.example.Assignment.RunnableAssignment;

public class Main1Class implements RunnableClass{
    @Override
    public void run() {
        System.out.println("Main1Class run() method");
    }

    public static void main(String[] args) {
        Main1Class  mainClass = new Main1Class();
        ThreadClass threadClass =  new ThreadClass(mainClass);
        threadClass.start();
        threadClass.sleep();

    }
}
