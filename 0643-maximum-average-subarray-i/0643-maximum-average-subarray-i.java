class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double ans = sum / k;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];

            ans = Math.max(ans, sum / k);
        }

        return ans;
    }
}