import java.util.Scanner;

public class young {

    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter Age");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        if(n>=14 && n<=40)
        {
            System.out.println("Young");
        }
        else
        {
            System.err.println("Not Young");
        }
    }
    
}
