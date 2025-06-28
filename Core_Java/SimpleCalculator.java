import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation: \n A. Addition \n B. Subtraction \n C. Multiplication \n D. Division: ");
        char op = sc.next().charAt(0);

    
        double result;
        switch (op) {
            case 'A': result = num1 + num2; break;
            case 'B': result = num1 - num2; break;
            case 'C': result = num1 * num2; break;
            case 'D': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: result = Double.NaN;
        }

        System.out.println("Result: " + result);
    }
}
