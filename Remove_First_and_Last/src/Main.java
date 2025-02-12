import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.next();

        for (int i = 1; i < str.length() - 1; i++) {
            result.append(str.charAt(i));
        }
        System.out.println(result);
        scanner.close();
    }
}