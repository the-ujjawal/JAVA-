public class Copy {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9};
        int B[] = new int[9];

        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        for(int i = 0; i < A.length; i++){
            B[i] = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i]+",");
        }   
    }
}
