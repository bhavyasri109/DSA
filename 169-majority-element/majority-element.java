class Solution {
    public int majorityElement(int[] nums) {
        int result=0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int majoritysize=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i])>majoritysize){
                result = nums[i];
                break;
            }
        }
        return result;
    }
}