import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        int i = 3;
        while (i <= n) {
            temp = b;
            b = b + a;
            a = temp;
            i++;
        }
        System.out.println(b);
    }
}
