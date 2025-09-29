package org.example.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TopicQueue {

    public static void main(String[] args) {
        Queue<Integer> integers  = new LinkedList<>();
        integers.add(4848); /// irrespective of memory, adds the element.
        integers.offer(484); /// checks and add the element if only memory is present.
        integers.offer(4554);
        System.out.println(integers.peek());  /// retrives the top element of Queue
        System.out.println(integers.poll()); /// retrives and removes the top element of Queue
        System.out.println(integers.element()); /// retrives the top element of Queue
        System.out.println(integers.remove());  /// retrives and removes the top element of Queue
    }
}
