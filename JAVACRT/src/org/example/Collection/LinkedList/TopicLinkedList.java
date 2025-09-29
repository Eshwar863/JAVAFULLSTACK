package org.example.Collection.LinkedList;

import java.util.LinkedList;

public class TopicLinkedList {
    public static void main(String[] args) {
        LinkedList l2 = new LinkedList();

        l2.add(45454);
        l2.add("esmfmb");

        l2.offer("Hello");
        System.out.println(l2);
    }

//    l2.offer();  /// if memory support then it will be added else no
//    l2.add(); /// irrespective of memory

    /**
     *
     If you use add() method -> That object will be added definently into our collection.


     If you use offer() method -> The object may or may not be added into our collection.
     It purely depends  memory availability.

     * */


}
