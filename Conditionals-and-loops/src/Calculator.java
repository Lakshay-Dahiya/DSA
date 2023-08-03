import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int ans=0;


        while (true){
            System.out.println("Enter operator");
            char op = x.next().trim().charAt(0);
            if (op=='+'|| op=='-'|| op=='*'|| op=='/'|| op=='%'){
                System.out.println("Enter 2 numbers");
                int num1 = x.nextInt();
                int num2 = x.nextInt();

                if (op=='+'){
                    ans= num1 + num2;
                }
                if (op=='-'){
                    ans =num1 - num2;
                }
                if (op =='*') {
                    ans = num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                    else{
                        System.out.println("Not divisible");
                    }
                }
                if(op=='%'){
                    ans = num1%num2;
                }

            } else if (op=='x' || op=='X') {
                break;
            }
            else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }
    }
}
