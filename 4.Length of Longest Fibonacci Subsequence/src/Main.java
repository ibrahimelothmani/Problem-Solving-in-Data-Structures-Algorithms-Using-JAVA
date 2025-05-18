public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr1 = {1,3,7,11,12,14,18};
        Solution solution = new Solution();
        System.out.println(solution.lenLongestFibSubseq(arr));
        System.out.println(solution.lenLongestFibSubseq(arr1));
    }
}