import java.util.Scanner;

public class PowerinJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base Number ");
        double base = in.nextInt();
        System.out.println("Enter Exponent ");
        double exponent = in.nextInt();

        System.out.println(CalculatePower(base,exponent));

    }
    public static double CalculatePower(double base, double exponent){
        double  ans = 1;
        if(exponent==0){
            return 1;
        }
        if(exponent < 0){
            base = 1 / base;
            exponent = -1 * exponent;
        }
        for(int i =1 ; i<= exponent ; i++){
            ans = ans * base;
        }
        return ans;
    }
}
