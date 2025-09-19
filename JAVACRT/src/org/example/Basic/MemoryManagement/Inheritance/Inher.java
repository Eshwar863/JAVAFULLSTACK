package org.example.Basic.MemoryManagement.Inheritance;



class A{
    A(){

        System.out.println("In A");
    } A(int a){
        System.out.println("In A para");
    }
    void inAm1(){
        System.out.println("In A m1()");
    }
    void sample(){
        System.out.println("In A sample");
    }
}
class B extends A{
    B(){
        //super(); /// default constructor
        super(5); /// parameterized Constructor
        System.out.println("In B");
    }
    B(int a){
        this();/// constructor in child class
        System.out.println("In B");
    }
    void inBm1(){
        System.out.println("In B m1()");
    }
    void sample(){
        System.out.println("In B sample");
    }
}
public class Inher {

    public static void main(String[] args) {
        /// Inside a static we cant create or declare "This" keyword
        A a = new B(); // can access only superclass
        a.inAm1();
        //a.inBm1(); cant be accessed
        a.sample(); /// B sample method will be called

        B b = new B(); /// both super class and subclass
        /// here first parent classs memory will allocate then comes to Child
        ///  we can access all methods varibles
        b.inAm1();
        b.inBm1();
        b.sample();

    }

}