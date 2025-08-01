
import java.util.Scanner;

public class GP {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first term :");
        int a = sc.nextInt();
        System.out.println("Enter common ratio :");
        int r = sc.nextInt();
        System.out.println("Enter number terms :");
        int n = sc.nextInt();

        System.out.print("GP series upto " +n+ "terms : ");

        int term = a;
        for(int i = 0; i < n; i++){
            System.out.print(term+" ");  //We print it first to get first term along with whole series
            term = term * r;            
        }
    }
}
