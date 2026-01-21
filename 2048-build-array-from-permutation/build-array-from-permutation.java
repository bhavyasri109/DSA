class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=nums[nums[i]];
        }
        return nums1;
    }
}