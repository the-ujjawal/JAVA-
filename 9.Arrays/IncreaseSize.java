public class IncreaseSize {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,8,0,5};
        int B[] = new int[2*A.length];

        System.out.println("Length of array A : "+A.length);

        // for (int i = 0; i < A.length; i++) {
        //     System.out.print(A[i]+","); 
        // }
        // System.out.println("");

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
            
        }
        // for (int i = 0; i < A.length; i++) {
        //     System.out.print(B[i]+",");
        // }
        // System.out.println();

        A=B;        

        System.out.println("New length of array A : "+A.length);
    }
}
