

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int resultAddition = 1;
        int resultMultiplication = 1;
        int resultSubtraction= 1;

        for (int j : array) {
            resultAddition += j;
            resultMultiplication *= j;
            resultSubtraction -= j;
        }
        System.out.println(resultAddition);
        System.out.println(resultMultiplication);
        System.out.println(resultSubtraction);
    }
}