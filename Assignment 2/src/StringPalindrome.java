import java.util.Locale;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter string");
        String s = x.next();

        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while(start < end ){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("not palindrome");
                //break;
                return; //we use return because after that nothing will execute in function
                        // if we use break it would always print yes because it is outside while loop
            }

            start++;
            end--;
        }
        System.out.println("yes");

    }
}
