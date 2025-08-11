import java.util.*;

public class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return 0;
        }
        
        long maxSum = 0;
        long currentSum = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // Add current number to frequency map
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            currentSum += nums[right];
            
            // If window size is k
            if (right - left + 1 == k) {
                // If all elements in the window are distinct
                if (freq.size() == k) {
                    maxSum = Math.max(maxSum, currentSum);
                }
                
                // Move left pointer
                int leftNum = nums[left];
                currentSum -= leftNum;
                freq.put(leftNum, freq.get(leftNum) - 1);
                if (freq.get(leftNum) == 0) {
                    freq.remove(leftNum);
                }
                left++;
            }
        }
        
        return maxSum;
    }
}
