
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Sting: ");
        String reversed = scanner.next();
        stringBuilder.append(reversed);
        System.out.println(stringBuilder.reverse());
    }
}