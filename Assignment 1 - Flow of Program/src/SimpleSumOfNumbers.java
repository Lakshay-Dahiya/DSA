import java.util.Scanner;

public class SimpleSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; // Initialize a variable to store the sum

        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break; // Exit the loop if the user enters 'x'
            }

            total += Double.parseDouble(userInput);
        }

        scanner.close();
        System.out.println("Sum of all entered numbers: " + total);
    }
}
