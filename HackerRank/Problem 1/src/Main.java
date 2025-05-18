//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.util.*;

public class Main {
    // Compare two integers
    static boolean compare(int a, int b) {
        return a == b;
    }

    // Compare two strings
    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    // Compare two integer arrays
    static boolean compare(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = Integer.parseInt(scan.nextLine().trim());
        while (testCases-- > 0) {
            int condition = Integer.parseInt(scan.nextLine().trim());
            switch (condition) {
                case 1:
                    String s1 = scan.nextLine().trim();
                    String s2 = scan.nextLine().trim();
                    System.out.println(compare(s1, s2) ? "Same" : "Different");
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    System.out.println(compare(num1, num2) ? "Same" : "Different");
                    if (scan.hasNext()) {
                        scan.nextLine(); // Clear buffer
                    }
                    break;
                case 3:
                    int size1 = scan.nextInt();
                    int size2 = scan.nextInt();
                    int[] array1 = new int[size1];
                    int[] array2 = new int[size2];
                    for (int i = 0; i < size1; i++) {
                        array1[i] = scan.nextInt();
                    }
                    for (int i = 0; i < size2; i++) {
                        array2[i] = scan.nextInt();
                    }
                    System.out.println(compare(array1, array2) ? "Same" : "Different");
                    if (scan.hasNext()) {
                        scan.nextLine(); // Clear buffer
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }
        }
        scan.close();
    }
}