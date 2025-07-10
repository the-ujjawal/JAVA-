import java.lang.*;
import java.util.Scanner;

public class Cuboid {
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double area,vol;

        System.out.println("Enter constants");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        area=2*(a*b+b*c+b*a);
        vol=a*b*c;

        System.out.println("Required Area of cuboid: "+area);
        System.out.println("Required Volume of cuboid: " +vol);
    }
    
}
