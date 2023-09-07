import java.util.Scanner;

public class Q24SumofAllNums {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter number");
            int y = x.nextInt();
            if(y!=0){
                sum = sum + y;
            }
            else{
                System.out.println("The sum is " + sum);
                break;
            }
        }
    }
}
