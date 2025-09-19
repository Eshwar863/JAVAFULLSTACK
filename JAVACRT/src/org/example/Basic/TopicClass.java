package org.example.Basic;

public class TopicClass {
    public static int count = 0; /// here count is not stored in the heap
    /// stored in a special memory area called Method Area Which is part of JVMs non-heap memory
    TopicClass(){
        count++;
    }
    public static void main(String[] args) {
        TopicClass c1  = new TopicClass();
        TopicClass c2  = new TopicClass();
        /// here the c1 c2 are local variables that are stored in methods Stack area
        /// but actual object new TopicClass() are stored in the Heap memory
        /// so the reference(c1 c2) is on stack, pointing to objects on the heap
        /// and static var like count live in Method Area or MetaSpace (exist independently of any object.)

        /// Method Area
        /// class-level metadata ---> static variables,Bytecode for methods and constructors and runtime constant poolfield and method data
    }
}
