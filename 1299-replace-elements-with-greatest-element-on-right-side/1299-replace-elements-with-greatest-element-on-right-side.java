class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];

        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >max) {
                    max = arr[j];
                }
            }
            ans[temp++] = max;
        }
        ans[n - 1] = -1;
        return ans;

    }
}