import java.util.Scanner;

public class Hacker_Rank {
    public static void main(String[] args) {



        System.out.println("Enter the website URL: ");
        Scanner vb = new Scanner(System.in);
        String url = vb.nextLine();
        //System.out.println(url.endsWith(".com"));

        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        }
        else if (url.endsWith(".in")) {
            System.out.println("Indian Website");
        }
        else {
            System.out.println("Please Enter a valid Url!");
        }
    }
}










