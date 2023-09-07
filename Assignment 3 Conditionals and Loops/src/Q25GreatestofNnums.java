import java.util.Scanner;

public class Q25GreatestofNnums {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int greatest = Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter Number");
            int y = x.nextInt();
            if(y!=0){
                if(y>greatest){
                    greatest = y;
                }
            }else{
                System.out.println("The greatest number is " + greatest);
                break;
            }
        }
    }
}
