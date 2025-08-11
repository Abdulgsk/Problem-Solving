import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 2) {
            return 0;
        }
        
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        
        // Slide a window of size k through the sorted array
        for (int i = 0; i <= nums.length - k; i++) {
            int currentDiff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, currentDiff);
        }
        
        return minDiff;
    }
}
