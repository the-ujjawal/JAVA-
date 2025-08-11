public class Delete {
    public static void main(String[] args){
        int A[] = {1,2,3,4,5,6,7,8,9};
        
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+",");
        }
        System.out.println("");

        int index = 2;
        for(int i = index; i < A.length-1; i++){
            A[i] = A[i+1];
        }

        for (int i = 0; i < A.length-1; i++) {
            System.out.print(A[i]+",");
            
        }
    }
}
