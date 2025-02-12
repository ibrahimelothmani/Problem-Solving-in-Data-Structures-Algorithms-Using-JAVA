import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");

        String word = scanner.next();

        System.out.print("Enter the Number: ");

        int number = scanner.nextInt();

        System.out.println(result.append(String.valueOf(word).repeat(number)));

        scanner.close();
    }
}