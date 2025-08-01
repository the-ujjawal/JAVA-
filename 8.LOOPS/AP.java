import java.util.*;
public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first term :");
        int a = sc.nextInt();
        System.out.println("Enter common difference :");
        int d = sc.nextInt();
        System.out.println("Enter number terms :");
        int n = sc.nextInt();

        int s = 0;                                   //initialise with 0 because we have to sum this up
        System.out.print("AP series upto " +n+ "terms : ");

        for(int i = 0; i <= n; i++){
            s = a + i*d;
            System.out.print(s+" ");
        }
    }
}
