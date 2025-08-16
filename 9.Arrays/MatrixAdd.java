public class MatrixAdd {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{7,5,9},{6,2,8}};
        int B[][] = {{4,5,6},{8,7,1},{6,3,4}};
        int C[][] = new int[3][3];

        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        for(int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
