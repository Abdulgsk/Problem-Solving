public class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];
        
        // maxLeft[i] is the maximum value from nums[0] to nums[i]
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            maxLeft[i] = max;
        }
        
        // minRight[i] is the minimum value from nums[i] to nums[n-1]
        int min = nums[n-1];
        for (int i = n-1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            minRight[i] = min;
        }
        
        // Find the first index where maxLeft[i] <= minRight[i+1]
        for (int i = 0; i < n-1; i++) {
            if (maxLeft[i] <= minRight[i+1]) {
                return i + 1;
            }
        }
        
        return -1; // Shouldn't reach here for valid inputs
    }
}
