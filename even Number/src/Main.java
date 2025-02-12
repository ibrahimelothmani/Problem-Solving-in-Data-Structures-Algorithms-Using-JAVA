import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? number * 8 : number * 9);

/*     if(number % 2 == 0) {
                System.out.println("Result = " + (number * 8));
            } else {
                System.out.println("Result = " + (number * 9));
            }

*/
    }
}