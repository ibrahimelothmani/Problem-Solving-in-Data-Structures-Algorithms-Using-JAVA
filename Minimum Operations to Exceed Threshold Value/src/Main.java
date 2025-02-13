import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 10, 7, 8, 4, 6, 20};
        System.out.println(minOperations(nums, 20));
    }

    public static int minOperations(int[] nums, int k) {

        PriorityQueue<Integer> array = new PriorityQueue<>();
        for(int num : nums){
            if(num < k) array.add(num);
        }
        int operation = 0;

        while(!array.isEmpty()){
            int x = array.poll();
            operation++;

            if(array.isEmpty()) break;
            int y = array.poll();
            long newValue = 2L * x + y;
            if (newValue < k) array.add((int) newValue);
        }
        return operation;
    }
}