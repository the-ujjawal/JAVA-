import java.util.Scanner;

public class Greater {
    
    // static int max(int x, int y){
    //     return x>y?x:y;
    // }

    static int max(int x, int y, int z){
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        else 
            return z;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third numnber : ");
        int c = sc.nextInt();

        System.out.println("Greatest number : "+max(a,b,c));
    }
}
