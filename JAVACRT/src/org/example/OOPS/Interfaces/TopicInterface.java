package org.example.OOPS.Interfaces;


public class TopicInterface{
    /// public class TopicInterface implements A will not impliment


    public static void main(String[] args) {
        /// lambda Expression ---> only works for Functional Interfaces
        A a = () -> {
            return 12;
        };
        /// without Code Block
        A a1 = () -> 12;


//        /// Anonymous Object
//        A a = new A() {
//
//        };
//        B b = new B() {
//        };
    }
}