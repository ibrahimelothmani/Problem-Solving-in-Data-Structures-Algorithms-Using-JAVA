import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test case
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        Solution solution = new Solution();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        System.out.println(result); // Expected output: [1, 2, 4, 8]
    }
}