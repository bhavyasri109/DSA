class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        int[] b= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            b[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=b[i];
        }
    }
}