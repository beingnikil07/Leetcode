class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=1;i<=n;i++){
            //if number is even
            if(n%2==0 && n%i==0){
                return n;
            }
        }

     //if n is odd,multiply it with 2 to make even multiple
        return n*2;
    }
}