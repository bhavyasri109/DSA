class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int size=nums.length/2;
        for(int key:m.keySet()){
            if (m.get(key)>size){
                return key;
            }
        }
        return -1;
    }
}