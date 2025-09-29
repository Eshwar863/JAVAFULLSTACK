package org.example.Collection.LinkedList.PlainLinkedList;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.next = null;
        this.data = data;
    }
}

public class SingleLinkedList {

   Node head;

   void insertAtBeginnning(int data){
       Node node = new Node(data);  /// asigning the data
       node.next = head; /// make data.nxt to null
       head = node; /// make data as 'head'
   }


   void insertAtEnd(int data){
       Node node = new Node(data); /// asign the data
       Node current = head; /// get the starting point and traverse to end
       while (current.next!= null){ ///  by checking the head(i.e data.next == null)
           current = current.next;
       }

       current.next = node; /// asign the data to the null
       /// automatically the data.next will be assigned to NULL

   }

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertAtBeginnning(12);
        singleLinkedList.insertAtBeginnning(12);
        singleLinkedList.insertAtEnd(15);
        Node current = singleLinkedList.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
