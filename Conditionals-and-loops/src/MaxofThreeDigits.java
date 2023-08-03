import java.util.Scanner;

public class MaxofThreeDigits {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a , b, c;
        a= x.nextInt();
        b= x.nextInt();
        c= x.nextInt();
        int max;
        if (a > b) {
            max=a;
        }
        else {
            max=b;
        }
        if (c>max){
            max=c;
        }
        System.out.println(max);
    }
}
