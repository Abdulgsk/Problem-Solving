public class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        // Calculate the common difference
        int diff = (arr[n-1] - arr[0]) / n;
        
        // Binary search for the missing number
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If the current element is as expected, search right
            if (arr[mid] == arr[0] + mid * diff) {
                left = mid + 1;
            } else { // Otherwise, search left
                right = mid;
            }
        }
        
        // The missing number is at left-1 position + diff
        return arr[0] + left * diff;
    }
}
