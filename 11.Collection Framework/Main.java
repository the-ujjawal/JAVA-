import java.util.Iterator;
import java.util.NoSuchElementException;

class MyList implements Iterable<Integer> {

    int[] arr = {10, 20, 30};

    // Give an Iterator
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {

            int index = 0;

            // Check if element exists
            public boolean hasNext() {
                return index < arr.length;
            }

            // Return element and move forward
            public Integer next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return arr[index++];
            }
        };
    }
}

public class Main {

    public static void main(String[] args) {

        MyList list = new MyList();

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}