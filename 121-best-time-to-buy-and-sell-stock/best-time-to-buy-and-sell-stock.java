class Solution {
    public int maxProfit(int[] nums) {
        int buy=nums[0];
        int maxprofit=0;
        for(int i=1;i<nums.length;i++){   
            maxprofit=Math.max(maxprofit, nums[i]-buy);
            buy=Math.min(nums[i],buy); 
        }
        return maxprofit;
    }
}