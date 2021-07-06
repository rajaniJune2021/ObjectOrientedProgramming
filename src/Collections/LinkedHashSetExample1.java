package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {

    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.forEach(k-> System.out.println(k));
        System.out.println("----------");
        linkedHashSet.add(20);
        linkedHashSet.forEach(k-> System.out.println(k));
    }
}
