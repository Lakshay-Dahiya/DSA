import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        long result = calculateCombination(n, r);
        System.out.println("nCr(" + n + ", " + r + ") = " + result);

        scanner.close();
    }

    public static long calculateCombination(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
