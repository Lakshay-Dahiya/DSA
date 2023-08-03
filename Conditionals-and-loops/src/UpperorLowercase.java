import java.util.Scanner;

public class UpperorLowercase {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char ch = x.next().trim().charAt(0); //important
         if (ch>='a' && ch<='z'){
             System.out.println("lowercase");
         }
         else{
             System.out.println("uppercase");
         }
    }
}
