class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<=n;i++){
            sum=sum + i;
        }
        int arrSum=0;
        for(int x:nums){
            arrSum +=x;
        }
        
        return sum-arrSum;
    }
}