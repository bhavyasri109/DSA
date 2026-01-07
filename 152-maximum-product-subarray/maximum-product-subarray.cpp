class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxx=nums[0];
        int minn=nums[0];
        int sol=nums[0];
        for(int i=1;i<nums.size();i++) {
            if(nums[i]<0)
                swap(maxx, minn);
            maxx=max(nums[i],nums[i]*maxx);
            minn=min(nums[i],nums[i]*minn);
            sol=max(sol,maxx);
        }
        return sol;
    }
};
