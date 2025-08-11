public class Insert {
    public static void main(String[] args) {
        
        int A[] = new int[10];
        A[0] = 3;
        A[1] = 9;
        A[2] = 2; 
        A[3] = 5;
        A[4] = 8;
        A[5] = 11;
        
        int n=6;

        for (int i = 0; i < n; i++) 
            System.out.print(A[i]+",");
        System.out.println("");

        // // int x=7;                     //in this code, last will be eliminated after insertion
        // // int index = 2;

        // // for(int i=n; i<index; i--)
        // //     A[i] = A[i-1];
        // // A[index] = x;

        // // for (int i = 0; i < n; i++) 
        // //     System.out.print(A[i]+",");
        // // System.out.println("");
        
        int x=7;
        int index = 2;

        for(int i=n; i>index; i--){
                A[i] = A[i-1];    
            }
            A[index] = x;
        

        for (int i = 0; i <=n; i++) 
            System.out.print(A[i]+",");

    }
}
