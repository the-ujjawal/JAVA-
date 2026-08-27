import java.util.Iterator;
import java.util.NoSuchElementException;

// Custom Iterator 

public class NameContainer implements Iterable<String> {

    private String[] names;

    public NameContainer(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public String next() {

                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return names[index++];
            }
        };
    }

    public static void main(String[] args) {

        String[] names = {"Ujjawal", "Rahul", "Raushan", "Ayush"};

        NameContainer container = new NameContainer(names);

        for (String name : container) {
            System.out.println(name);
        }
    }
}