class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        //sort the array
        Arrays.sort(nums);
        //if elements are positive 
        int max1=nums[n-1]*nums[n-2]*nums[n-3];
        int max2=nums[0]*nums[1]*nums[n-1];

        return Math.max(max1,max2);
    }
}