package collections;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("Programming");
        set.add("Language");

        System.out.println("Set: " + set);

        set.remove("Java");
        System.out.println("Set after removing element 'Java': " + set);

        System.out.println("Contains element 'Hello': " + set.contains("Hello"));

        System.out.println("Size of set: " + set.size());

        set.clear();
        System.out.println("Set after clearing: " + set);
    }
}
