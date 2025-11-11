import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int numberOfNames = 5;
        System.out.println(String.format("Insert %d names: ", numberOfNames));
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println(String.format("Inserting the %d name: ", (i + 1)));
            arrayList.add(scanner.nextLine());
        }
        System.out.println(String.format("The result array is %s", arrayList));

        System.out.println("Witch should be removed by value?");
        String removeName = scanner.nextLine();
        arrayList.remove(removeName);
        System.out.println(String.format("The result array is %s", arrayList));
        System.out.println("Which should be removed by index?");
        int removeIndex = scanner.nextInt();
        scanner.nextLine();
        if (removeIndex >= 0 && removeIndex < arrayList.size()) {
            arrayList.remove(removeIndex);
        } else {
            System.out.println("Invalid index.");
        }
        System.out.println(String.format("The result array is %s", arrayList));

        System.out.println(String.format("The array result size is %d.", arrayList.size()));

        System.out.println("Check if the array contains the name: ");
        String checkName = scanner.nextLine();
        System.out.println(String.format("The name %s is present? %b", checkName, arrayList.contains(checkName)));
        scanner.close();
    }
}
