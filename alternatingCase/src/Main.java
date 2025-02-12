import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The WORD: ");
        String word = scanner.next();

        if (word.equals(word.toLowerCase())) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }

        scanner.close();

    }
}