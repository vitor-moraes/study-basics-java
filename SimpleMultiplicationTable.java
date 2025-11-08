import java.util.Scanner;

public class SimpleMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            String message = String.format("%d x %d = %d", number, i, i * number);
            System.out.println(message);
        }
        scanner.close();
    }
}