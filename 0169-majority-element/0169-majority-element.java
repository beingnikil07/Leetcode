class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) > n / 2) {
                return x;
            }
        }

        return -1;
    }
}