import java.util.*;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1); // Base case: sum 0 has occurred once
        
        int sum = 0;
        int count = 0;
        
        for (int num : nums) {
            sum += num;
            // If (sum - k) exists in prefixSum, it means there's a subarray with sum k
            if (prefixSum.containsKey(sum - k)) {
                count += prefixSum.get(sum - k);
            }
            // Update the prefixSum map
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
