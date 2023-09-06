import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumsinRange {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter starting value");
        int start = x.nextInt();
        System.out.println("ender last digit");
        int end = x.nextInt();

        for(;start<=end;start++){
            //System.out.println(isArmstrong(start));  // this just prints T or F
            if(isArmstrong(start)){
                System.out.println(start + " ");
            }
        }

    }
    public static boolean isArmstrong(int num){
        int temp = num;
        int sum =0;
        while(num>0){
            int lastdigit = num % 10;
            sum = sum + (lastdigit*lastdigit*lastdigit);
            num = num/10;
        }
        //if(sum == temp){
           // return true;
        return sum == temp; // use this instead of if wali statement
    }
}

