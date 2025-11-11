import java.util.Arrays;
import java.util.Scanner;

public class CharacterConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        char[] charWord = word.toCharArray();
        System.out.println("Characters: " + Arrays.toString(charWord));
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        System.out.println("As string: " + numberString);
        System.out.println("As integer + 1: " + (number + 1)w);
        scanner.close();
    }
}