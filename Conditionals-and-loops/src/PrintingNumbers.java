import java.util.Scanner;

public class PrintingNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
