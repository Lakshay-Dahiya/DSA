import java.util.Scanner;

public class StringReturnType {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

    }
    static String greet(){
        Scanner x =new Scanner(System.in);
        System.out.println("Enter String");
        String greeting = x.nextLine();
        return greeting;
    }
}
