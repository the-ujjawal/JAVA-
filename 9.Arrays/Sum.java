public class Sum {
    public static void main(String[] args) {
        int A[] = {2,5,8,6,2,4,7,3,1,5};
        int sum = 0;

        // for (int i = 0; i < A.length; i++) {
        //     sum = sum + A[i];
        // }
        // System.out.println(sum);

        for(int x:A){                     //Another way to find the sum
        sum = sum + x;
        }
        System.out.println("Sum is "+sum);
    }   
}
