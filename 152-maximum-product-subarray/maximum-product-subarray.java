class Solution {
    public int maxProduct(int[] nums) {
        int maxx=nums[0];
        int minn=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxx;
                maxx=minn;
                minn=temp;
            }
            maxx=Math.max(nums[i],maxx*nums[i]);
            minn=Math.min(nums[i],minn*nums[i]);
            result=Math.max(result,maxx);
        }
        return result;
    }
}