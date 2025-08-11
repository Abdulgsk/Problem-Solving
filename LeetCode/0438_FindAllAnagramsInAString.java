import java.util.*;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Initialize the frequency map for p and the first window in s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        
        // Slide the window
        for (int i = p.length(); i < s.length(); i++) {
            // Remove the leftmost character of the window
            sCount[s.charAt(i - p.length()) - 'a']--;
            // Add the new character to the window
            sCount[s.charAt(i) - 'a']++;
            
            // Compare the frequency maps
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }
        
        return result;
    }
}
