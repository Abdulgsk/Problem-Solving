import java.util.*;

public class Solution {
    public int maximumProduct(int[] nums, int k) {
        // Use a min-heap to always get the smallest element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add all elements to the heap
        for (int num : nums) {
            minHeap.offer(num);
        }
        
        // Perform k operations: each time increment the smallest element
        while (k-- > 0) {
            int smallest = minHeap.poll();
            minHeap.offer(smallest + 1);
        }
        
        // Calculate the product
        long product = 1;
        while (!minHeap.isEmpty()) {
            product = (product * minHeap.poll()) % 1_000_000_007;
        }
        
        return (int) product;
    }
}
