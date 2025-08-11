public class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        // To track the maximum values we can achieve for each position
        int[] result = new int[3];
        
        for (int[] triplet : triplets) {
            // Skip triplets that have any value greater than the target
            if (triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) {
                continue;
            }
            
            // Update the maximum values we can achieve
            result[0] = Math.max(result[0], triplet[0]);
            result[1] = Math.max(result[1], triplet[1]);
            result[2] = Math.max(result[2], triplet[2]);
            
            // If we've matched the target, return true
            if (result[0] == target[0] && result[1] == target[1] && result[2] == target[2]) {
                return true;
            }
        }
        
        return false;
    }
}
