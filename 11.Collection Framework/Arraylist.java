import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 1. Get the iterator
        Iterator<String> it = fruits.iterator();

        // 2. Loop through elements
        while (it.hasNext()) {
            String fruit = it.next(); // Always store in a variable
            System.out.println(fruit);
        }
    }
}