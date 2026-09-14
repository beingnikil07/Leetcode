class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        //sort the array
        Arrays.sort(nums);

        //  First loop for first number
        for (int i = 0; i < n; i++) {
            // Skip duplicates for first number
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Second loop for second number
            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for second number
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                // Step 4: Two pointers for remaining two numbers
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Move left pointer skipping duplicates
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        // Move right pointer skipping duplicates
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        left++;
                        right--;
                    } else if (sum < target)
                        left++;
                    else
                        right--;
                }
            }
        }
        return ans;
    }
}