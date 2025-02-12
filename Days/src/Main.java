import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number Of Day: ");
        int day = scanner.nextInt();

        try {
            switch (day) {
                case 1 -> System.out.println("The Day is: Monday");
                case 2 -> System.out.println("The Day is: Tuesday");
                case 3 -> System.out.println("The Day is: Wednesday");
                case 4 -> System.out.println("The Day is: Thursday");
                case 5 -> System.out.println("The Day is: Friday");
                case 6 -> System.out.println("The Day is: Saturday");
                case 7 -> System.out.println("The Day is: Sunday");
                default -> System.out.println("Error Please enter a valid Number");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
