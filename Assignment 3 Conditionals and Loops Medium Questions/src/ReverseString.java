import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter string");
        String str = inp.next();

        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String rev_str = "";
        for(int i=0; i<str.length();i++){
            //rev_str = rev_str + str.charAt(i); //this will give same , do dry run bro
            rev_str = str.charAt(i) + rev_str;
        }
        return rev_str;
    }
}
