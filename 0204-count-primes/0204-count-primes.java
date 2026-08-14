class Solution {
    public int countPrimes(int n) {

        if(n<2) return 0;


        boolean isPrime[]=new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<n;j=j+i){
                isPrime[j]=false;
            }
        }
        int count=0;
        for(boolean x:isPrime){
            if(x==true){
                count++;
            }
        }
        return count;
    }
}