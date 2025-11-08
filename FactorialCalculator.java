import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        String message = String.format("The factorial of %d is %d.", number, factorial);
        System.out.println(message);
        scanner.close();
    }
}