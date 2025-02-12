import java.util.Scanner;

public class Bulb {
    // Class Variables
    private static int TotalBulbCount = 0;

    // Instance Variables
    private Scanner scanner = new Scanner(System.in);
    private boolean isOn;

    // Constructor
    public Bulb() {
        System.out.print("Enter True Or False: ");
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
        return isOn;
    }

    // Instance Method
    public boolean turnOff() {
        isOn = false;
        return isOn;
    }

    // Instance Method
    public boolean isOnFun() {
        return isOn;
    }
}