class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
        int cmax=0,maxs=nums[0];
        int cmin=0,mins=nums[0];
        int total=0;
        for(int x:nums){
            cmin=min(x,cmin+x);
            mins=min(mins,cmin);
            cmax=max(x,cmax+x);
            maxs=max(maxs,cmax);
            total+=x;
        }
        if(maxs<0){
            return maxs;
        }
        return max(total-mins,maxs);
    }
};