import java.util.*;

public class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        
        int left = 0;
        int minLeft = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);
            if (target.containsKey(r)) {
                target.put(r, target.get(r) - 1);
                if (target.get(r) >= 0) {
                    count++;
                }
            }
            
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLeft = left;
                    minLen = right - left + 1;
                }
                
                char l = s.charAt(left);
                if (target.containsKey(l)) {
                    target.put(l, target.get(l) + 1);
                    if (target.get(l) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
