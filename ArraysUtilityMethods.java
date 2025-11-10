import java.util.Arrays;

public class ArraysUtilityMethods {
    public static void main(String[] args) {
        int[] originalArray = { 1, 3, 5, 2, 4 };
        System.out.println("Original array: " + Arrays.toString(originalArray));
        Arrays.sort(originalArray);
        System.out.println("Sorted array: " + Arrays.toString(originalArray));
        int searchTo = 3;
        int foundValue = Arrays.binarySearch(originalArray, searchTo);
        String binarySearchMessage = String.format(
                "Number %d" + (foundValue != -1 ? (" found in " + foundValue + ".") : (" not found.")), searchTo);
        System.out.println(binarySearchMessage);
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        Arrays.fill(originalArray, 7);
        System.out.println("Filled array: " + Arrays.toString(originalArray));
    }
}