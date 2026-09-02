import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //System.out.println(list.get(1));
 
        // list.set(1, 5);
        // list.addAll(0, List.of(7,8,9));

        // System.out.println(list);

        // list.remove(0);
        // System.out.println(list);

        ListIterator<Integer> it = list.listIterator(3);
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
