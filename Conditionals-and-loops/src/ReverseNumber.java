import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter number you want to reverse");
        int num = x.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num/10;
        }
        System.out.println(ans);
    }
}
