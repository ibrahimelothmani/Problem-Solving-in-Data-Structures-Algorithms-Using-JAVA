import java.util.*;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // Create a result list to store the span values
        ArrayList<Integer> span = new ArrayList<>();

        // Stack to store the indices of the elements in arr
        Stack<Integer> stack = new Stack<>();

        // Traverse through each element in the input array
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack while they are smaller than or equal to the current element
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, the span is i + 1 (because current element is greater than all previous elements)
            if (stack.isEmpty()) {
                span.add(i + 1);
            } else {
                // Else, the span is the difference between the current index and the index of the top element in the stack
                span.add(i - stack.peek());
            }

            // Push the current index to the stack
            stack.push(i);
        }

        // Return the calculated span values
        return span;
    }
}