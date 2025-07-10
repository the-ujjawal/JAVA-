
import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Domain Name");
        String domain=scan.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext)
        {
            case "com": System.out.println("Commercial");
                break;

            case "org": System.out.println("porganization");
                break;

            case "gov": System.out.println("government");
                break;

            case "net": System.out.println("network");
                break;

        }

    }
    
}
