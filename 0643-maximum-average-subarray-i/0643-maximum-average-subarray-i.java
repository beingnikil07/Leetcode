class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        double ans = 0.0;
        double sum = 0.0;
        //calculate first k elements sum 
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        avg = sum / k;
        ans = avg;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            avg = sum / k;
            ans = Math.max(ans, avg);
        }
        return ans;
    }
}