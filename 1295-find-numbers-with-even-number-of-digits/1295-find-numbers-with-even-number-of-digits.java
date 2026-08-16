class Solution {
    public int findNumbers(int[] arr) {
        
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>9 && arr[i]<101){
                count++;
            }

            if(arr[i]>999 && arr[i]<=9999){
                count++;
            }
            if(arr[i] >99999){
                count++;
            }            
        }
        return count;
    }
}