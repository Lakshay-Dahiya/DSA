import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number for which you want factorial");
        int n = x.nextInt();
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
