import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            
            // If current and next intervals overlap, merge them
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        
        // Add the last interval
        result.add(current);
        
        return result.toArray(new int[result.size()][]);
    }
}
