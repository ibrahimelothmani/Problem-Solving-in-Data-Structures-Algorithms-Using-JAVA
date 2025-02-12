import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Prompt: ");
        String clean = scanner.next();
        StringBuilder newClean = new StringBuilder();
        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != '!') {
                newClean.append(clean.charAt(i));
            }
        }
        System.out.println(newClean);
    }
}