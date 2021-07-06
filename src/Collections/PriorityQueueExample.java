package Collections;

//Queue Interface:
//        First in first out for removing of element.
//        Object creation of queue interface can done via priorityQueue or ArrayDeque.

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.add(200);
        queue.add(400);
        queue.add(600);
        queue.remove(600);

        queue.forEach(k-> System.out.println(k));

        System.out.println(queue.poll());// remove the first lements

        System.out.println(queue.peek());// tope element of the priority queue collection

    }
}
