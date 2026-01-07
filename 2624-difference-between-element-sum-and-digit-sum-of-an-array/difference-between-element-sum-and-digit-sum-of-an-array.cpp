class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int es=0;
        for(int i=0;i<nums.size();i++){
            es+=nums[i];
        }
        int ds=0;
        for(int i=0;i<nums.size();i++){
            while(nums[i]>0){
                int digit=nums[i]%10;
                ds+=digit;
                nums[i]=nums[i]/10;
            }
        }
        return es-ds;
    }
};