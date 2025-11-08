import java.util.HashMap;
import java.util.Scanner;

public class TwoSumWithHashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be used?");
        int numbersCount = scanner.nextInt();

        int[] numbers = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            String message = String.format("Enter the %d number.", i + 1);
            System.out.println(message);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("What is the target?");
        int target = scanner.nextInt();

        twoSum(numbers, target);
        scanner.close();
    }

    public static void twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // number | index
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int complement = target - number;
            if (map.containsKey(complement)) {
                String message = String.format("Indices of numbers that sum to %d: %d and %d", target,
                        map.get(complement),
                        i);
                System.out.println(message);
                return;
            }
            map.put(number, i);
        }

        throw new IllegalArgumentException("No two sum result found.");
    }
}