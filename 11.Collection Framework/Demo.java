import java.util.*;

public class Demo {
    public static void main(String[] args){
        Collection<Integer> c = new LinkedList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        int n = c.size();
        
        //System.out.println(c.size());
        //System.out.println(c.isEmpty());
        //System.out.println(c.contains(6));

        Integer[] arr = c.toArray(new Integer[0]);
        for(Integer i : arr){
            System.out.println(i);
        }


    }
}
