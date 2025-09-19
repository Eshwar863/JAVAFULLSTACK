package org.example.Basic.MemoryManagement;

public class ConceptObject  {
    public int a = 10;
    public int b = 11;

    void m(){
        int a = 45;
        int b = 45;
    }

    public static void main(String[] args) {
        int a =12;
        int b = 123;

        ConceptObject conceptObject = new ConceptObject();
        conceptObject.m();
        System.out.println(conceptObject);

        /// org.example.org.example.Basic.MemoryManagement.ConceptObject@6acbcfc0
        /// ConceptObject@6acbcfc0 classname@hashcode (generated using to String)
    }
}
