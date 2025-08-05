
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search : ");
        int n = sc.nextInt();

        int A[] = {2,8,6,4,7,3,1,5};

        for (int i = 0; i < A.length; i++) {
            if (n==A[i]) {
                System.out.println("Element is found at : "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
