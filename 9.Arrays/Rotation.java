public class Rotation {
    public static void main(String[] args) {
        int A[] = {4,5,3,2,9,8,7,1};

        for(int x : A)
            System.out.print(x+",");
            System.out.println("");

        // int temp = A[0];                        //Left side traversal/rotation
        // for (int i = 1; i < A.length; i++) {
        //     A[i-1] = A[i];
            
        // }
        // A[A.length - 1] = temp;


        
        int temp = A[A.length-1];                  //Right side traversal
        for (int i = A.length-1; i > 0; i--) {
            A[i] = A[i-1];
            
        }
        A[0] = temp;
        for(int x : A)
            System.out.print(x+",");
            System.out.println("");

    }
}
