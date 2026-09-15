class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        /* Track the index while iterating through  intervals */
        int i = 0;
        int n = intervals.length;

        // Insert intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            // Move to next interval
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            // Move to the next interval
            i++;
        }
        res.add(newInterval);

        while (i < n) {
            res.add(intervals[i]);

            // Move to next interval
            i++;
        }

        // Convert the result list to a 2D array and return
        return res.toArray(new int[res.size()][]);
    }
}