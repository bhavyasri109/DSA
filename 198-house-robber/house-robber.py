class Solution:
    def rob(self, nums: List[int]) -> int:
        @cache
        def f(i):
            if i<0:
                return 0
            if i==0:
                return nums[i]
            p=nums[i]+f(i-2)
            np=f(i-1)
            return max(p,np)
        return f(len(nums)-1)