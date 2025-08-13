public class Reverse {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,0};
        int B[] = new int[10];

        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+",");
        }
        System.out.println();

        for(int i=A.length-1, j = 0; i>=0; i--, j++){
            B[j]=A[i];
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(B[i]+",");
        }
    }
}
