class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            maxprofit=Math.max(maxprofit,prices[i]-buy);
            buy=Math.min(prices[i],buy);
        }
        return maxprofit;
    }
}