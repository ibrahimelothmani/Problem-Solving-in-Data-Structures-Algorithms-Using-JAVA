
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The WORD: ");

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' '){
                result.append(word.charAt(i));
            }
        }
        System.out.println(result);

        scanner.close();
    }
}