import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String string = scanner.next();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder res = stringBuilder.append(string);
        System.out.println(res);

        scanner.close();
    }
}