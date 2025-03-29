import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 6, 4, 5, 7, 8, 9, 3, 2, 1, 10};

//        for (int number : numbers) {
//            System.out.print(number + "\n");
//            System.out.println(".............................");
            System.out.println(Arrays.stream(
                    numbers).max().getAsInt()
            );
            System.out.println(Arrays.stream(
                    numbers).min().getAsInt()
            );
            System.out.println(Arrays.stream(
                    numbers).sum()
            );
            System.out.println(Arrays.stream(
                    numbers).average().getAsDouble()
            );
            System.out.println(Arrays.stream(
                    numbers).count()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 == 0).count()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 != 0).count()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 == 0).sum()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 != 0).sum()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 == 0).average().getAsDouble()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 != 0).average().getAsDouble()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 == 0).max().getAsInt()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 != 0).max().getAsInt()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 == 0).min().getAsInt()
            );
            System.out.println(Arrays.stream(
                    numbers).filter(number -> number % 2 != 0).min().getAsInt()
            );
//        }
    }
}