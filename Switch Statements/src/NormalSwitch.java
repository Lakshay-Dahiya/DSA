import java.util.Scanner;

public class NormalSwitch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String Fruit = x.next();
        switch (Fruit){
            case "Mango":
                System.out.println("King Fruit");
                break;
            case "Apple":
                System.out.println("Best Company");
                break;
            case "Grapes":
                System.out.println("Small Green Fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("Invalid Fruit Name");
        }
    }
}
