package org.example.OOPS.Final;

public class FinalMethodOverriding {
        final void show() {
            System.out.println("Final method in parent");
        }
    }

    class Child extends FinalMethodOverriding {
        // This will cause a compile-time error
//        final void show() {
//            System.out.println("Trying to override final method");
//        }
        public static void main(String[] args) {
//            Trying to compile the above results in an error:
//            error: show() in Child cannot override show() in Parent; overridden method is final

        FinalMethodOverriding finalMethodOverriding = new Child();
        finalMethodOverriding.show(); /// here the parent class method is called
                                        ///  here we cant acces the same method in child
            /// here if we make the child as final but parent is not final then the overriding is possible

        }
}
