class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int moreNeeded = 0;
        for (int i = 0; i < nums.length; i++) {
            moreNeeded = target - nums[i];

            if (map.containsKey(moreNeeded)) {
                return new int[] { i, map.get(moreNeeded) };
            }
            //add to map
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}