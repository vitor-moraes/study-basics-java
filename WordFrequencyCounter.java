import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        Set<String> mapKeysSet = map.keySet();

        for (String key : mapKeysSet) {
            String message = String.format("The word %s appears %d times in the sentence", key, map.get(key));
            System.out.println(message);
        }

        scanner.close();
    }
}