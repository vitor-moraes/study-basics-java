import java.util.Scanner;

public class AgeCategory {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How many years old do you have?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: " + name + ", Age: " + age);
        
        if (age < 18) {
            System.out.println("Hello " + name + "! You're underage.");
        } else if (age <= 59) {
            System.out.println("Hello " + name + "! You're an adult.");
        } else {
            System.out.println("Hello " + name + "! You're a senior citizen.");
        }
    
        scanner.close();
    }
}