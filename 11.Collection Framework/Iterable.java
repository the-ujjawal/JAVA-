import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {

    public static void main(String[] args) {

        // Creating a List
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Creating an Iterator
        Iterator<Integer> it = list.iterator();

        // Traversing the List using Iterator
        while (it.hasNext()) {

            Integer val = it.next();

            System.out.println(val);
        }
    }
}