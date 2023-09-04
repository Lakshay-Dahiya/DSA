import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        int sum = 0;
        Scanner x = new Scanner(System.in);
        while (true){
            System.out.println("Enter number ( or 'x' to exit )\n");

            char ch = x.next().charAt(0);
            if ( ch=='x' || ch=='X'){
                break;
            }
            else{
                sum = sum + Character.getNumericValue(ch);  ;
            }
        }
        System.out.println("sum is " + sum);
    }
}
