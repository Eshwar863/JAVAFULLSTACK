package org.example.OOPS.Static;

public class CanStaticMethodOverloading {

        public static void greet() {
            System.out.println("RunnableClass!");
        }
        public static void greet(String name) {
            System.out.println("RunnableClass, " + name + "!");
        }
        public static void main(String[] args) {
            CanStaticMethodOverloading.greet();         // Output: RunnableClass!
            CanStaticMethodOverloading.greet("Lucky");  // Output: RunnableClass, Lucky!
        }
//    Here, both run() and run(String name) are static and overloaded, because they have different parameters.
//    """Key Points"""
//    Static methods can be overloaded in the same way as instance methods.
//    The overloaded method chosen depends on the method parameters at compile time.
//    The return type cannot be used alone to overload methods.

}
