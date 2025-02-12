import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number n: ");
        boolean condition = true;
        int n = scanner.nextInt();
        System.out.print("Enter Number x: ");
        int x = scanner.nextInt();
        System.out.print("Enter Number y: ");
        int y = scanner.nextInt();
        if(n % x == 0 && n % y == 0){
            System.out.println(condition);
        }else {
            System.out.println(!condition);
        }
        // OR
        System.out.println((n % x == 0 && n % y == 0) == condition);
    }
}