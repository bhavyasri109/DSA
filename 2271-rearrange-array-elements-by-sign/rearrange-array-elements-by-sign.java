class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result= new int[nums.length];
        int postiveindex=0;
        int negativeindex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[postiveindex]=nums[i];
                postiveindex+=2;
            }
            else{
                result[negativeindex]=nums[i];
                negativeindex+=2;
            }
        }
        return result;
    }
}