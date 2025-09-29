package org.example.Assignment.RunnableAssignment;

public class Main2Class implements RunnableClass {
    @Override
    public void run() {
        System.out.println("Main1Class run() method");
    }
    public static void main(String[] args) {
        Main2Class  mainClass = new Main2Class();
        ThreadClass threadClass =  new ThreadClass(mainClass);
        threadClass.start();
        threadClass.sleep();

    }
}
