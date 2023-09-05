import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter Prinipal");
        float p = x.nextFloat();
        System.out.println("enter Rate");
        float r = x.nextFloat();
        System.out.println("enter Time");
        int t = x.nextInt();

        double SI = (p*r*t)/100;
        System.out.println("Simple Interest is " + SI);

    }
}
