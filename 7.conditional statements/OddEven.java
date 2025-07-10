import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter NUmber");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}

