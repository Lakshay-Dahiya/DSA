import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter name");
        String y = x.nextLine();

        if (y.equals("Lakshay")) {
            System.out.println("bot");
        }
        else if (y.equals("Shivansh")) {
            System.out.println("Pro COder");
        }
        else if (y.equals("Akshat")) {
            System.out.println("appdev");
        }
        else if (y.equals("Arnav")){
            System.out.println("webdev");
        }
        else {
            System.out.println("cpp");
        }

    }
}
