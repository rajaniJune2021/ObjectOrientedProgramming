package Collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.forEach(k-> System.out.println(k));
        System.out.println("---------");
        treeSet.add(50);
        treeSet.forEach(k-> System.out.println(k));

    }


}
