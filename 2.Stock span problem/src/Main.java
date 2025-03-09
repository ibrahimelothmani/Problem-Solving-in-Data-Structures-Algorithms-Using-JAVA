import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {100, 80, 60, 70, 60, 75, 85};

        ArrayList<Integer> result = solution.calculateSpan(arr);

        // Output the result
        System.out.println(result);  // Output: [1, 1, 1, 2, 1, 4, 6]
    }
}
