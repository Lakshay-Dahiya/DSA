import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter number to check");
        int a = x.nextInt();
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }


    }
}
