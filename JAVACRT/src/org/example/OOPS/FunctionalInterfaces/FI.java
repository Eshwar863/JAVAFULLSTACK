package org.example.OOPS.FunctionalInterfaces;

import org.example.OOPS.Interfaces.A;

public class FI {
    /// public class FI implements A will not impliment


    public static void main(String[] args) {
        /// lambda Expression ---> only works for Functional Interfaces
        A a = () -> {
            return 12;
        };
        /// without Code Block
        A a1 = () -> 12;

        /// without parameters
        FIwithoutPara fIwithoutPara = () -> 12;
        /// with Parameters
//        FIwithPara fIwithPara  = (5,10) -> {
//
//        }


//        /// Anonymous Object
//        A a = new A() {
//
//        };
//        B b = new B() {
//        };
    }
}
