class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        ArrayList<Integer> temp = new ArrayList();
        for (int x : set1) {
            if (!set2.contains(x)) {
                temp.add(x);
            }
        }

        list.add(temp);

        temp = new ArrayList<>();
        for (int x : set2) {
            if (!set1.contains(x)) {
                temp.add(x);
            }
        }
        list.add(temp);
   
        return list;
    }
}