
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        // Calculate the XOR of all elements
        for (int num : nums) {
            totalXor |= num;
        }
        // The total number of subsets is 2^n
        // Each element contributes to half of the subsets
        // So we multiply the totalXor by 2^(n-1)
        int totalSubsets = 1 << (n - 1);
        // The final result is the totalXor multiplied by the number of subsets
        return totalXor * totalSubsets;
    }
}