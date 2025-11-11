import java.util.Scanner;

public class ReverseTheWordsOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] splitSentence = sentence.split(" ");
        String[] reversedSplitSentence = new String[splitSentence.length];
        for (int i = 0; i < splitSentence.length; i++) {
            reversedSplitSentence[i] = splitSentence[splitSentence.length - 1 - i];
        }
        String reversedSentence = String.join(" ", reversedSplitSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
        scanner.close();
    }
}