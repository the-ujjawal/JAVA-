
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for getting table : ");
        int n = sc.nextInt();

        System.out.println("Here yours table :");
        for (int i = 1; i <= 10; i++) {
            int m = n*i;
            System.out.println(n+ " * " +i+ " = " +m);     // instead of m, we can directly put n*i
        }
    }
}
