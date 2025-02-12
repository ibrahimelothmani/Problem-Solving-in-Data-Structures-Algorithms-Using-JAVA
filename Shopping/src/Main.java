import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the price per unit: ");
        int price = sc.nextInt();
        int total = (quantity -(quantity / 3)) * price;
        System.out.println("The total is " + total + " TND");
        sc.close();
    }
}