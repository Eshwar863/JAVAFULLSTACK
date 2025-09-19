package org.example.OOPS.Static;

public class CanStaticMethodOverloading {

        public static void greet() {
            System.out.println("Hello!");
        }
        public static void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }
        public static void main(String[] args) {
            CanStaticMethodOverloading.greet();         // Output: Hello!
            CanStaticMethodOverloading.greet("Lucky");  // Output: Hello, Lucky!
        }
//    Here, both greet() and greet(String name) are static and overloaded, because they have different parameters.
//    """Key Points"""
//    Static methods can be overloaded in the same way as instance methods.
//    The overloaded method chosen depends on the method parameters at compile time.
//    The return type cannot be used alone to overload methods.

}
