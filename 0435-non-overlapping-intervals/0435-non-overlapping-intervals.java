import java.util.*;

class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort intervals based on their ending time
        // Greedy: Keep the interval that ends earliest
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        // Count of intervals to remove
        int count = 0;

        // End time of the last accepted interval
        int prevEnd = intervals[0][1];

        // Start from the second interval
        for (int i = 1; i < intervals.length; i++) {

            // If current interval starts before previous ends,then both intervals overlap
            if (intervals[i][0] < prevEnd) {

                // Remove current interval
                count++;

            } else {

                // No overlap, accept current interval, Update the ending time
                prevEnd = intervals[i][1];
            }
        }

        // Return minimum number of intervals to remove
        return count;
    }
}