import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you're array will have?");
        int arrayLength = scanner.nextInt();

        if (arrayLength <= 0) {
            System.out.println("Array must have at least one element.");
            scanner.close();
            return;
        }
        
        int[] array = new int[arrayLength];
        double arraySum = 0.0f;

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the number for the " + (i + 1) + " position: ");
            array[i] = scanner.nextInt();
            arraySum += array[i];
        }

        double arrayAverage = arraySum / arrayLength;
        System.out.println("Array sum: " + arraySum);
        System.out.println("Array average: " + arrayAverage);

        scanner.close();
    }
}