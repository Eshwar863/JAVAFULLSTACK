package org.example.OOPS.Static;
class Parent {
    public static void staticMethod() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Child's static method");
    }
}

public class CanStaticMethodsOverride {
    public static void main(String[] args) {
        Parent p = new Child();
//        Static methods belong to the class, not any object.
//         Overriding works only for methods that belong to objects (non-static methods).
//        If a child class writes a static method with the same name as the parent, it does not replace the parent’s method—it only hides it.
//        If you use a parent class reference, even if it points to a child class object, calling the static method will use the parent’s version.

        p.staticMethod(); // Output: Parent's static method
    }
}
