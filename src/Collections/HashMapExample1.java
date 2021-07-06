package Collections;

import java.util.HashMap;
import java.util.Map;

//HashMap:
//        Hashmap uses hashing technique to determine the position of the key in map.
//        Hashing: Hashing is a technique of mapping keys and values into hashtable by using hash function.
//        x is a key hash function is x%10
//        Default size of the hashmap is 16 (0-15 indexes)
// it allows one null key and multiple null values.
//difference between hashmap and hashtable
//HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code whereas Hashtable is synchronized. ... HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value.

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"pooja");
        map.put(2,"bhaskar");
        map.put(3,"ravi");
        map.put(4,"sangeetha");

        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.print(m.getKey()+":");
            System.out.println(m.getValue());
        }
    }
}
