import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Handle empty or null input
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int n = nums.length;
        // Sort the array first
        Arrays.sort(nums);

        // dp[i] represents the size of largest subset ending at index i
        int[] dp = new int[n];
        // prev[i] stores the previous index in the largest subset
        int[] prev = new int[n];

        // Initialize arrays
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int maxSize = 1;  // Track maximum subset size
        int maxIndex = 0; // Track ending index of maximum subset

        // Dynamic programming approach
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        // Reconstruct the answer
        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        // Reverse to get ascending order
        Collections.reverse(result);
        return result;
    }
}