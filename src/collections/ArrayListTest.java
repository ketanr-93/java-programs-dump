package collections;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Language");

        System.out.println("List: " + list);

        list.remove(2);
        System.out.println("List after removing element at index 2: " + list);

        list.set(2, "Python");
        System.out.println("List after setting element at index 2: " + list);

        System.out.println("Element at index 3: " + list.get(3));

        System.out.println("Index of element 'Java': " + list.indexOf("Java"));

        System.out.println("Size of list: " + list.size());

        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
