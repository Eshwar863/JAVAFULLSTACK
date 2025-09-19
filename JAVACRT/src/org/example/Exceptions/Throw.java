package org.example.Exceptions;

public class Throw {

   static void Age(int age){
        if(age<18){
            throw new ArithmeticException("Age is less than 18");
        }
        else {
            System.out.println("Ok");
        }
    }
    public static void main(String[] args) {
        Age(18);
    }
}
