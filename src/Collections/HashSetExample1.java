package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("automation");
        hs.add("testing");
        hs.add("programm");
        //hs.forEach(k-> System.out.println(k));// validate insertion order, doesn't add the values in insertion order.
        System.out.println("---------");
        hs.add("testing");
        hs.forEach(k-> System.out.println(k));
        hs.remove("programm");
        System.out.println("---------");
        hs.forEach(k-> System.out.println(k));

    }
}
