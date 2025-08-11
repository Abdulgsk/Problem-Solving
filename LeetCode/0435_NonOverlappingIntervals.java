import java.util.*;

public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        // Sort intervals based on end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int end = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            // If current interval starts before the previous end, it's overlapping
            if (intervals[i][0] < end) {
                count++;
            } else {
                // Update end to the current interval's end
                end = intervals[i][1];
            }
        }
        
        return count;
    }
}
