package org.example.Exceptions;

import java.sql.SQLClientInfoException;

public class Throws  {

    static void Age(int age) throws ArithmeticException,NullPointerException{  /// we can declare as many we can
                                                                                /// but only one is used
        if(age<18){
            throw new ArithmeticException("Age is less than 18");
        }
        else {
            System.out.println("Ok");
        }
        /// here we are handling at method level
        /// throws here "S" indicates some Signature
    }
    public static void main(String[] args) {
        Age(18);
    }
}
