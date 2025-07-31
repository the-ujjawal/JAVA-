import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int m = n;
        int sum = 0;

        while (n>0) {
            int r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;

        }
        if (m == sum) {
            System.out.println("It is an armstrong number");
            
        } else {
            System.out.println("It is not an armstrong number");
        }
    }
}
