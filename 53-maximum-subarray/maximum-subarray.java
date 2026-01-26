class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            maxsum=Math.max(cs,maxsum);
        }
        return maxsum;
    }
}