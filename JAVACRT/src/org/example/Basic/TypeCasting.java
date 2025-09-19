package org.example.Basic;

public class TypeCasting {
    public static void main(String[] args) {
//        code();
//        code1();
//        code3();
//        code4();
        code5();
    }

    static void code(){
        byte a = 10;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        /// here conversion is done by System
    }

    static void code1(){
//        int a = 10;
//        System.out.println(a);
//        byte b = a; /// compile time error
//        /// here we need to convert it Explicitly  byte b = (byte)a
//        System.out.println(b);
    }

    static void code3(){
        char a = 'A';
        System.out.println(a);
        int b = a;
        System.out.println(b); //65
    }
    static void code4(){
        int a = 65;
        char b = (char)a;
    }

    static void code5(){
        int a = 129;
        byte b = (byte)a;
        System.out.println(b);
        float c = b;
        System.out.println(c);
    }
}
