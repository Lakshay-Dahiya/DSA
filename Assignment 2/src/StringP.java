import java.util.Scanner;

public class StringP {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = x.next();
        s = s.toLowerCase();
        int left = 0; // Initialize the left pointer
        int right = s.length() - 1; // Initialize the right pointer
        boolean isPalindrome = true; // Assume it's a palindrome by default

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false; // If characters don't match, it's not a palindrome
                break; // No need to check further
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
