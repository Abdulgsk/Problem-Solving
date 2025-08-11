import java.util.*;

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            sum += num;
            // If (sum - goal) exists in prefixSum, it means there's a subarray with sum goal
            if (prefixSum.containsKey(sum - goal)) {
                count += prefixSum.get(sum - goal);
            }
            // Update the prefixSum map
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
