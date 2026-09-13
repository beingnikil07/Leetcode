class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // To store numbers between j and k
                HashSet<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    // Find required fourth number
                    long required = (long) target - arr[i] - arr[j] - arr[k];

                    // If required number already seen → valid quadruplet
                    if (required >= Integer.MIN_VALUE && required <= Integer.MAX_VALUE
                            && seen.contains((int) required)) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) required);
                        Collections.sort(temp);
                        set.add(temp);
                    }

                    // Add current third number into set
                    seen.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}