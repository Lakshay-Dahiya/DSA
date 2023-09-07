import java.util.Scanner;

public class AverageofNumbers {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int average;
        int sum = 0;
        System.out.println("enter total numbers you want to input");
        int n = x.nextInt();
        int i = 0 ;
        while(i < n){
            System.out.println("enter number");
            int num = x.nextInt();
            sum = sum + num;
            i++;
        }
        average = sum / n;
        System.out.println("The average is " + average);
    }
}
