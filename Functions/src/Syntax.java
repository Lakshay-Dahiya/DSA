import java.util.Scanner;

public class Syntax {
    public static void main(String[] args) {

        sum();
    }
    static void sum(){
        System.out.println("Enter number 1 and 2");
        Scanner x =new Scanner(System.in);
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        int sum =num1+num2;
        System.out.println("the sum is " + sum);

    }
}
