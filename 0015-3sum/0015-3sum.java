class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0)
                break;
            // Skip duplicates for first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1, right = nums.length - 1;

            // Find pairs for current nums[i]
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }

        }
        return res;
    }
}