class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)>nums.length/3 && ! list.contains(x)){
                list.add(x);
            }
        }       
        return list;
    }
}