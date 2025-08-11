public class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        int windowSum = 0;
        int n = cardPoints.length;
        int windowSize = n - k;
        
        // Calculate total sum and initial window sum
        for (int i = 0; i < n; i++) {
            totalSum += cardPoints[i];
            if (i < windowSize) {
                windowSum += cardPoints[i];
            }
        }
        
        if (k == n) return totalSum;
        
        int minWindowSum = windowSum;
        
        // Slide the window and find the minimum window sum
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minWindowSum = Math.min(minWindowSum, windowSum);
        }
        
        return totalSum - minWindowSum;
    }
}
