import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        
        while (n>0) {
            int r = n%10;
            n = n/10;
            System.out.println(r);
        }
        //System.out.println(n);
        // if we print this n at last then we will get 0, as n has became 0 at last.
    }
}
