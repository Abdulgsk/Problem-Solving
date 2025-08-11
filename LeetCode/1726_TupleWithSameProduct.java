import java.util.*;

public class Solution {
    public int tupleSameProduct(int[] nums) {
        if (nums == null || nums.length < 4) {
            return 0;
        }
        
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        
        // Count all possible products of pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                // For each product, the number of valid tuples increases by 8 * (current count of this product)
                count += 8 * productCount.getOrDefault(product, 0);
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        
        return count;
    }
}
