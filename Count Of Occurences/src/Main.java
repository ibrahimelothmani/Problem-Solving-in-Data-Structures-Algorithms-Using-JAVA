import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter The word: ");
        String word = scanner.next();
        System.out.print("Enter The Letter: ");
        String letter = scanner.next();

        if (letter.length() != 1) {
            System.out.println("Please enter a single letter.");
            return;
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                result++;
            }
        }
        System.out.println(result);
        scanner.close();
    }

}


