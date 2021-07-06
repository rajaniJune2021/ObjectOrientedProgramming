package Collections;

//LinkedList:
//
//        1. Uses double linkedList data Structure to store the elements.
//        2. It implements list and Deque interfaces.
//        3. Linked list allows to store duplicate elements
//        4. Manipulation of data is faster than Array list.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClassMethodExample {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("testing");
        linkedList.add("automation");
        linkedList.add("testing");
        Iterator<String> iterator = linkedList.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

// solve same problems of arraylist
