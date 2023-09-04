import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0; // Initialize a variable to store the sum

        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("x")) {
                break; // Exit the loop if the user enters 'x'
            }

            try {
                double number = Double.parseDouble(userInput);
                total += number; // Add the number to the total
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to exit.");
            }
        }

        scanner.close();
        System.out.println("Sum of all entered numbers: " + total);
    }
}
