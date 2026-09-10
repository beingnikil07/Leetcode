class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        int max = arr[n - 1];
        ans[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {

            ans[i] = max;

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return ans;
    }
}