class Solution {

    public static void reverse(int arr[], int low, int end) {
        while (low <= end) {
            int temp = arr[low];
            arr[low] = arr[end];
            arr[end] = temp;
            low++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            k = k % n;
        }
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }
}