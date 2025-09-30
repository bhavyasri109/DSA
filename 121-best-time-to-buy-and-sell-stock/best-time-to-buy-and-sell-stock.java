class Solution {
    public int maxProfit(int[] nums) {
        int buy=nums[0];
        int maxprofit=0;
        for(int i=1;i<nums.length;i++){   
            if(nums[i]<buy){
                buy=nums[i];
            } 
            else if(nums[i]-buy>maxprofit){
                maxprofit=nums[i]-buy;
            }
        }
        return maxprofit;
    }
}