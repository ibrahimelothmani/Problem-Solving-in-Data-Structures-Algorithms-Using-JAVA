import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int oneSecond = 1000;
        int oneMinute = 60 * oneSecond;
        int oneHour = 60 * oneMinute;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Second: ");
        int Second = scanner.nextInt();

        System.out.print("Enter The Minute: ");
        int Minute = scanner.nextInt();

        System.out.print("Enter The Hour: ");
        int Hour = scanner.nextInt();

        int result = ((Hour * oneHour) + (Minute * oneMinute) + (Second * oneSecond));

        System.out.println("Time in Millisecond: " + result);

        scanner.close();
    }
}