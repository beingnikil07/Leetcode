class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count1=0,count2=0;
        int ans1=0, ans2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0&& ans2!=nums[i]){
                ans1=nums[i];
                count1=1;
            }
            else if(ans1==nums[i]){
                count1++;
            }
            else if(count2==0 && ans1!=nums[i]){
                ans2=nums[i];
                count2=1;
            }
            else if(ans2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int x:nums){
            if(x==ans1){
                count1++;
            }
            if(x==ans2){
                count2++;
            }
        }

        if(count1>nums.length/3 && !list.contains(ans1)){
            list.add(ans1);
        }
        if(count2>nums.length/3 && !list.contains(ans2)){
            list.add(ans2);
        }

        return list;
    }
}