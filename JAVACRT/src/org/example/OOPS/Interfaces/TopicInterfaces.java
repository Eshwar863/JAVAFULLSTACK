package org.example.OOPS.Interfaces;

interface TopicInterfaces extends A,B{
    /**
     to achive Multiple Inheritance
     it is a collection of public static final
     we can only write abstract methods
     public abstract
     we cant create Obj creation
     interfaces will support 100% abstraction
     */

     public static final int a = 12;
     String print();/// implicitly"" public abstract""


     /// here we can extend any interface "''''''interface TopicInterfaces extends A,B''''''"{
    public static void main(String[] args) {
        System.out.println("vdjsvn");
    }



    /**
     * class A {}
     * class B {}
     * interface C {}
     * interface D {}
     *
     * class Main extends A {}                 // Only extends one class
     * class Main1 implements C, D {}        // Implements multiple interfaces
     * class Demo extends A implements C, D {} // Extends class and implements interfaces
     * class Demo1 extends A implements C, D {} // Same as above
     *
     * interface S extends C, D {}            // Interface extending multiple interfaces
     * */



    /**
     * if an interface contains only on abstrct method then it is functional interface
     *
     *
     * Interface Abc{
     *     int callAbc();
     * }
     *
     *
     * @FuntionalInterface
     *  Interface Abc{
     *       int callAbc();
     *
     *  }
     * */


    /// here if we override a method we need to keep public

}

