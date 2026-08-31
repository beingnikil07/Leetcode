class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];
        int total_sum = 0;
        for (int x : nums) {
            total_sum += x;
        }

        int left_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int right_sum = total_sum - left_sum - nums[i];
            ans[i] = Math.abs(left_sum - right_sum);
            left_sum += nums[i];
        }
        return ans;
    }
}