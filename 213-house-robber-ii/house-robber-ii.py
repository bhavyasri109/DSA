class Solution:
    def robber(self,nums):
        n=len(nums)
        if n==1:
            return nums[0]
        dp=[0]*n
        dp[0]=nums[0]
        dp[1]=max(nums[0],nums[1])
        for i in range(2,n):
            t=nums[i]+dp[i-2]
            s=dp[i-1]
            dp[i]=max(t,s)
        return dp[n-1]
    def rob(self, nums: List[int]) -> int:
        n=len(nums)
        if n==1:
            return nums[0]
        return max(self.robber(nums[:-1]),self.robber(nums[1:]))
    