public class Maximum {
    public static void main(String[] args) {
        
        int A[] = {2,8,6,4,7,3,1,5,9};
        // int max = A[0];                       //Program to print maximum element
        // for (int i = 0; i < A.length; i++) {
        //     if(A[i]>max){
        //         max = A[i]; 
        //     }
            
        // }

        int max1 = A[0];                        //Program to print second maximum element
        int max2 = A[0];
        for(int i = 0; i < A.length; i++){
            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            }
            else if(A[i]>max2){
                max2 = A[i];
            }
        }
        System.out.println("Second maximum element is : "+max2);
    }
}
