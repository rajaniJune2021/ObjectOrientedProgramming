package Collections;

//Stack data structure:
//
//        1. Last in first out:(LIFO) data structure.
//        2. Extending the vector class, child class of vector.
//        3. Push method used to adding the elements and Pop is removing.
//        4. There is no default size it's empty stack
//// allow one null value
//This hashset class permits the null element . No, Set Interface do allow null value only its implementation i.e. TreeSet doesn't allow null value. even though you have not written iteration code and have only oTreeSet. add(null) in your code it compiles and at runtime it throws NullPointerException.
//

import java.util.Stack;

public class StackClassExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println("last element of stack is:"+stack.peek());

        int j = stack.pop();
        System.out.println("element removed is:"+j);

        System.out.println(stack.search(3));// if value exist it will print 1, doesn't exist it print -1.

    }
}
