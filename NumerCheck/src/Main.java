import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int check = scanner.nextInt();
        System.out.println((check % 2 == 0)? "Even" : "Odd");

    }
}