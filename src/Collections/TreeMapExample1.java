package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {

    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("Company",200);
        map.put("school",300);
        map.put("college",400);

        for(Map.Entry<String,Integer> m: map.entrySet()){
            System.out.print(m.getKey()+":");
            System.out.println(m.getValue());// sort in ascending order based on keys
        }
    }
}
