import java.util.Scanner;

public class NcR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = in.nextInt();
        System.out.println("Enter value of r");
        int r = in.nextInt();

        long result =CalculateCombination(n,r);
        System.out.println(result);
    }

    public static long CalculateCombination(int n, int r) {
        if(r>n || r<0){
            return 0;
        }
        return factorial(n)/ (factorial(n-r) * factorial(r));
    }
    public static long factorial(int n){
        if(n==0){
            return 1;
        }
        long result = 1;
        for (int i = 1; i <=n ; i++) {
            result = result *i;
        }return result;
    }
}
