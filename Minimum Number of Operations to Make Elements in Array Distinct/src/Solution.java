


public class Solution {
    public int minimumOperations(int[] nums) {

        boolean[] v = new boolean[128];
        int n = nums.length;

        for(int i = n - 1; i >= 0; i--){
            if( v[nums[i]]){
                return i / 3 + 1;
            }
            v[nums[i]] = true;
        }
        return 0;
    }
}