import java.util.Scanner;

public class Bulb {
    // Class Variables
    private static int TotalBulbCount = 0;

    private boolean isOn;

    // Constructor
    public Bulb() {
        System.out.print("Enter True Or False: ");
        // Instance Variables
        Scanner scanner = new Scanner(System.in);
        this.isOn = scanner.hasNextBoolean() && scanner.nextBoolean();
        TotalBulbCount++;
    }

    // Class Method
    public static int getBulbCount() {
        return TotalBulbCount;
    }

    // Instance Method
    public boolean turnOn() {
        isOn = true;
        return true;
    }

    // Instance Method
    public boolean turnOff() {
        isOn = false;
        return false;
    }

    // Instance Method
    public boolean isOnFun() {
        return isOn;
    }
}