class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i in range(len(nums)):
            c=target-nums[i]
            if c in d:
                return [i,d[c]]
            d[nums[i]]=i
        return [-1,-1]
