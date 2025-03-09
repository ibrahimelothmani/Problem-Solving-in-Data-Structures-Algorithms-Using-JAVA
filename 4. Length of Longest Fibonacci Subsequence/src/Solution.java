import java.util.HashSet;
import java.util.Set;

class Solution {

    public int lenLongestFibSubseq(int[] arr) {

        int n = arr.length;

        Set<Integer> numS = new HashSet<>();
        for(int num : arr) numS.add(num);


        int maxL = 0;

        for (int start = 0; start < n; ++start) {
            for (int next = start + 1; next < n; ++next){
                int prev = arr[next];
                int curr = arr[start] + arr[next];
                int len = 2;

                while(numS.contains(curr)){
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    maxL = Math.max(maxL, ++len);
                }
            }
        }
        return maxL;

    }
}


//class Solution {
//    public int lenLongestFibSubseq(int[] arr) {
//        final int n = arr.length;
//        int ans = 0;
//        int[][] dp = new int[n][n];
//        Arrays.stream(dp).forEach(row -> Arrays.fill(row, 2));
//        Map<Integer, Integer> numToIndex = new HashMap<>();
//
//        for (int i = 0; i < n; ++i)
//            numToIndex.put(arr[i], i);
//
//        for (int j = 0; j < n; ++j)
//            for (int k = j + 1; k < n; ++k) {
//                final int ai = arr[k] - arr[j];
//                if (ai < arr[j] && numToIndex.containsKey(ai)) {
//                    final int i = numToIndex.get(ai);
//                    dp[j][k] = dp[i][j] + 1;
//                    ans = Math.max(ans, dp[j][k]);
//                }
//            }
//
//        return ans;
//    }
//}