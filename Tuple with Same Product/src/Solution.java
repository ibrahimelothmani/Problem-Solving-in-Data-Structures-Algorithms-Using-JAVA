// Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d)
// such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tupleSameProduct(int[] nums) {

        Map<Integer, Integer> proCnt = new HashMap<>();

        int m = nums.length;

        for(int i =0; i < m; i++){
            for(int j = i+1; j<m; j++){
                int product = nums[i] * nums[j];
                proCnt.put(product, proCnt.getOrDefault(product, 0) + 1);
            }
        }
        int res = 0;
        for(int count : proCnt.values()){
            if(count > 1){
                res += count * (count -1) * 4;
            }
        }
        return res;
    }
}
