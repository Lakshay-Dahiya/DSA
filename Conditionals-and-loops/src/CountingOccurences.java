import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int digit ;
        digit = x.nextInt();
        System.out.println("enter number");
        int num = x.nextInt();
        int count =0;


        while (num>0) {
            int rem = num%10;
            if (rem == digit) {
                count++;
            }
            num=num/10;
        }

        System.out.println(count);

    }
}
