import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Year: ");
        int year = scanner.nextInt();
        if(year % 100 == 0){
            System.out.println(year + " --> " + year / 100);
        }else {
            System.out.println(year + " --> " + ((year / 100) + 1));
        }
    }
}