public class Patterns {
    public static void main(String[] args) {
        
        //PATTERN : 1
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(j+ " ");
                
        //PATTERN : 2
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(i+" ");

        //PATTERN : 3
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(i+j+" ");
                
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%2d ",count);    //format is used instead of print to format the result to take two places by every digits to form a proper pattern
            }
        System.out.println();   
        }
        
    }
}
