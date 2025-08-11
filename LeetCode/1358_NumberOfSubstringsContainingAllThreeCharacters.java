public class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // To keep track of a, b, c counts
        int res = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'a']++;
            
            // If we have at least one of each character in the current window
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                // All substrings ending at 'right' with start >= left are valid
                res += s.length() - right;
                // Move left pointer to try to find smaller windows
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        
        return res;
    }
}
