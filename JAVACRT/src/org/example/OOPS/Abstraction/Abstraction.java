package org.example.OOPS.Abstraction;

abstract class Abstraction {
    /// we can also declare constructor as well
    /// we can also have Main method

    abstract void A();
    /// void A();  /// generates compile time errors or else we need to declare the Block {} code block
    void B(){
        /// here we need to declare body
    }
    /// here we cant create the object for Abstract
    /// cant be static private final

    public static void main(String[] args) {

    }
}
