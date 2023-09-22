import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter value of n");
        n = in.nextInt();
        for(int i=2 ; i<n ; i++){
            if(n%i == 0){
                sum +=1;      //sum+=sum is wrong it will do 0+0, sum = sum +1
            }
        }
        System.out.println(sum);
        if(sum == 0){
            System.out.println("Prime");
        }else if (sum != 0){
            System.out.println("Not Prime");
        }

    }


}
