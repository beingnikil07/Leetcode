class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Sort elements by frequency
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        // First k elements
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}