class Solution {
    public int maxProfit(int[] prices) {
        int maxP =0;
        int profit=0;
        int b=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            profit = prices[i] - b;
            b = Math.min(b,prices[i]);
            if(profit>maxP){
                maxP = profit;   
            }

        }
        return maxP;
    }
}
