package Collections;


//
//List interface:
//
//        1. list interface is child interface of Collection
//        2. it uses list type data structure to store the objects in an order manner.
//        3. it can store duplicate values.
//        4. list interface implemented by the ArrayList, LinkedList and Vector classes.
//        5. if we create object for the interface it wil be thread safe.
//
//        List<Integer> list = new ArrayList();
//        List<String> list = new LinkedList();
//        List<Integer> list = new Vector();
//        List<String> list = new Stack();

//ArrayList:
//
//        1. ArrayList implements the List interface
//2. It uses a dynamic array to store the elements
//        3. Maintains the insertion order.
// ArrayList default size 10


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClassMethodsExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(200);
        list.add(2); // store the duplicates and insertion order.
        Iterator  iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

//April 20th:
// wap to remove duplicates elements from the arraylist.
// wap to reverse the arraylist.
// wap to sort the elements of the arraylist.
// wap convert arraylist into array.
// wap to combine two arraylist into single arraylist.
// wap to find the size of the arraylist without using the pre-defined method.
// wap to compare two arraylist and print the common elements.
// wap to swap two elements of an arraylist.
// wap to create a subList from the arrayList.
