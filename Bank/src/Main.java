import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        double balance = 0;
        double amount;

        switch (choice) {
            case 1:
                System.out.print("Enter the amount to deposit: ");
                amount = scanner.nextDouble();
                balance += amount;
                System.out.println(STR."Amount deposited: \{amount}");
                System.out.println(STR."Current Balance: \{balance}");
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                amount = scanner.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    balance -= amount;
                    System.out.println(STR."Amount withdrawn: \{amount}");
                    System.out.println(STR."Current Balance: \{balance}");
                }
                break;
            case 3:
                System.out.println(STR."Current Balance: \{balance}");
                break;
            case 4:
                System.out.println("Thank you for using our service");
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}