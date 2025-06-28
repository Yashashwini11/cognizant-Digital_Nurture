import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed))
            System.out.println("It's a palindrome.");
        else
            System.out.println("Not a palindrome.");
    }
}
