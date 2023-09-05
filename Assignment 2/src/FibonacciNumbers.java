import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("enter value of n");

        int n = x.nextInt();
        int first = 0;
        int second = 1;
        int c =0;

        System.out.println(first);
        System.out.println(second);

        for(int i =3 ; i<=n ; i++){
            c = first + second;
            System.out.println(c);
            first = second;
            second = c;
        }
        System.out.println("Nth Fibonacci Number is " + c);

    }
}
