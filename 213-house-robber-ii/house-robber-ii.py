class Solution:
    def rob(self, nums: List[int]) -> int:
        n=len(nums)
        if n==1:
            return nums[0]
        def solve(arr):
            @cache
            def f(i):
                if i<0:
                    return 0
                if i==0:
                    return arr[0]
                p=arr[i]+f(i-2)
                np=f(i-1)
                return max(p,np)
            return f(len(arr)-1)
        return max(solve(nums[:-1]),solve(nums[1:]))