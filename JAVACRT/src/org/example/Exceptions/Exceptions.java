package org.example.Exceptions;

public class Exceptions {

    public static void main(String[] args) {
        try{
            int a =10/0;
            System.out.println("Will not excute");
        }
        /// try will be followed by a Catch or Finally
        ///  we can add as many as we can
        catch(Exception e){
            System.out.println(e);
            System.err.println(e); /// here we can store the error in file
            e.printStackTrace(); /// will tell us where actually or the line has the error
        }
        /// catch (ArithmeticException e){}       ""here the code is unreachable"" (if it is on top of Exception then this will exceute)
        finally {
            /// irrespective of exception and catch block
        }
    }
}
