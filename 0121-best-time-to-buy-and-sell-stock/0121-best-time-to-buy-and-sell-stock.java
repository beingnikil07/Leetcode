class Solution {
    public int maxProfit(int[] prices) {
        int maxi = 0;
        int lowest_buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (lowest_buy < prices[i]) {
                int profit=prices[i] -lowest_buy;
                maxi=Math.max(profit,maxi);
            }
            else{
                lowest_buy=prices[i];
            }
        }
        return maxi;
    }
}