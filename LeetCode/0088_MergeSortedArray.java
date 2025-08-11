public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int p1 = m - 1;     // Last element in nums1
        int p2 = n - 1;     // Last element in nums2
        int p = m + n - 1;  // Last position in nums1 (including extra space)
        
        // While there are elements to compare in both arrays
        while (p1 >= 0 && p2 >= 0) {
            // Compare elements and place the larger one at the end of nums1
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        // (if there are remaining in nums1, they're already in place)
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
