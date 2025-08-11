import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            
            // Remove smaller elements as they are not needed
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            
            q.offer(i);
            
            // Add to result when window size is reached
            if (i >= k - 1) {
                result[idx++] = nums[q.peek()];
            }
        }
        
        return result;
    }
}
