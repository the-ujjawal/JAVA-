public class Patterns2 {
    public static void main(String[] args) {

        //Pattern 1
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //   }   


        // Pattern 2
        // int count = 0;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         count++;
        //         System.out.print(count+" ");
        //     }


        //Pattern 3
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=6-i; j++) {
                count++;
                System.out.print(j+" ");
            }
            
        
            
            System.out.println("");
        }
                
        
    }
}
