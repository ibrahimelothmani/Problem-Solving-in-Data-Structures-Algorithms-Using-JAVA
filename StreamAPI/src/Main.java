import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {0, 6, 4, 5, 7, 8, 9, 3, 2, 1, 10};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(
                    Arrays.stream(numbers)
                            .map(n -> n % 2));
        }
    }
}