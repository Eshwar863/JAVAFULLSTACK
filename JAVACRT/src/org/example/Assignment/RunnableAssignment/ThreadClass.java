package org.example.Assignment.RunnableAssignment;

public class ThreadClass {

    RunnableClass runnableClass;
    public ThreadClass(RunnableClass runnableClass){
        this.runnableClass = runnableClass;}

    public void start(){
        runnableClass.run();
        System.out.println("calling runnable class run()");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
