import java.util.Scanner;

public class SumThreeNumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 0, 0, 0 };
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = scanner.nextInt();
            sum += number;
            numbers[i] = number;
        }
        String message = String.format("The sum of values %d, %d and %d is %d.", numbers[0], numbers[1], numbers[2],
                sum);
        System.out.println(message);
        scanner.close();
    }
}