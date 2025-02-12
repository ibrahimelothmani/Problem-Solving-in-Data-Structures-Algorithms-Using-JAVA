import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = { 2, 4, 6, 8, 10, 12, 1000};
//        System.out.println(Arrays.stream(array).min());
//        System.out.println(Arrays.stream(array).max());

    }


    int min(int[] list){
        int minValue = list[0];

        for (int j : list) {
            if (j < minValue) {
                minValue = j;
            }
        }
        return minValue;

    }

    int max(int[] list){
        int maxValue = list[0];

        for (int j : list) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }
}