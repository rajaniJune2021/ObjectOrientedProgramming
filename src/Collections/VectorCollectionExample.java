package Collections;

//Vector and stack:
//
//        1.legacy data structure it contains additional methods inadditions to the collections methods.
//        2. Implements List interface same as Arraylist and linked list.
//        3.Uses Dynamic array to store the elements
//        4.It also maintains insertion order and it is synchronized(thread safe)
//        5.poor performances compare to other collection( like, adding deleting)
//        6. Default size of vector is 10 and dynamically increases or decreases.


import java.util.Iterator;
import java.util.Vector;

public class VectorCollectionExample {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5);
        vector.add(10);
        vector.add(300);
        vector.add(800);
        vector.add(500);
        vector.set(0,600);  // updating the specific index can be done in vecor with set method.
        vector.add(700);
        vector.add(400);

       // Iterator iterator = vector.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        for (int k: vector){
//            System.out.println(k);
//        }

        vector.forEach( s -> System.out.println(s));  //lamda expression

        System.out.println(vector.capacity());

        vector.remove(4);
        vector.remove(3);
        System.out.println("Vector capacity after deleting the elements " + vector.capacity());



    }
}
