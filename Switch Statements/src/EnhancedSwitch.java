import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String Fruit = x.next();
        switch (Fruit) {
            case "Mango" -> System.out.println("King Fruit");
            case "Apple" -> System.out.println("Best Company");
            case "Grapes" -> System.out.println("Small Green Fruit");
            case "Orange" -> System.out.println("Round Fruit");
            default -> System.out.println("Invalid Fruit Name");
        }
    }
}
