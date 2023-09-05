import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.println("enter 2 numbers");
            int a = x.nextInt();
            int b = x.nextInt();

            System.out.println("enter operator");
            char op = x.next().charAt(0);

            if(op=='+'){
                 ans = a + b;
            } else if (op=='-') {
                ans = a-b;
            } else if (op=='*') {
                ans = a*b;
            } else if (op=='/') {
                if(b == 0){
                    System.out.println("not divisible");
                }else{
                    ans = a/b;
                }
            }else{
                break;
            }
            System.out.println(ans);
        }
    }
}
