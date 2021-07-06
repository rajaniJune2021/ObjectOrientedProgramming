package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample1 {

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"c");
        map.put(3,"python");
        map.put(4,"ruby");

        for (Map.Entry<Integer,String> m :map.entrySet()){
            System.out.print(m.getKey()+":");
            System.out.println(m.getValue());
        }
    }
}
