import java.util.Scanner;

public class WithReturn {
    public static void main(String[] args) {
        int ans =sum();
        System.out.println(ans);
    }
    static int sum(){
        System.out.println("Enter number 1 and 2");
        Scanner x =new Scanner(System.in);
        int num1 = x.nextInt();
        int num2 = x.nextInt();
        int sum2 =num1+num2;

        return sum2;
      //  System.out.println("the sum is " + sum); will give error because nothing runs after return
                                                  //statement
    }
}
