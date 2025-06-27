package collections;
import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Hello");
        map.put(3, "Java");
        map.put(4, "Programming");
        map.put(5, "Language");
        map.put(3, "World");

        for(Map.Entry mapp:map.entrySet())
        {
            System.out.println(mapp.getKey()+" "+mapp.getValue());
        }

        map.remove(3);
        System.out.println("Map after removing element with key 3: " + map);

        map.put(2, "Python");
        System.out.println("Map after updating element with key 2: " + map);

        System.out.println("Element with key 4: " + map.get(4));

        System.out.println("Contains key 1: " + map.containsKey(1));

        System.out.println("Size of map: " + map.size());

        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}
