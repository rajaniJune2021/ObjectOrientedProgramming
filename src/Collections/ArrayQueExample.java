package Collections;

//Deque Interface: extending the queue interface
//Dequeu - Double ended queue
//        it supports addition or removal of element from either end end of data structure.
//        Either can be used as stack(last in first out) or a queue(first in first out)
//        Dequeue interface implmneted by Array Deque class and LinkedList class

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueExample {

    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(300);
        integerDeque.add(500);
        integerDeque.addFirst(700);
        integerDeque.addLast(800);
// lambda expression
        integerDeque.forEach(k-> System.out.println(k));
        System.out.println("--------------------");
        System.out.println(integerDeque.pollFirst());// removed the first element
        System.out.println("--------------------");
        System.out.println(integerDeque.pollLast()); // removed last element

    }
}
