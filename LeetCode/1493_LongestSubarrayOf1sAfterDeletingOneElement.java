public class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int left = 0;
        int zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If there are more than one 0s, move left pointer
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left);
        }
        
        return maxLen == nums.length ? maxLen - 1 : maxLen;
    }
}
