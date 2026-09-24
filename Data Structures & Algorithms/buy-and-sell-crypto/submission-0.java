class Solution {
    public int maxProfit(int[] prices) {

        int max_profit=0;
        int bp=prices[0];
        int profit;
        for(int i=1;i<prices.length;i++)
        {
            profit=prices[i]-bp;
            max_profit=Math.max(max_profit,profit);
            bp=Math.min(bp,prices[i]);
        }
        return max_profit;

        
    }
}
