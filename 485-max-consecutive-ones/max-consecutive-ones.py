class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        c=0
        maxc=0
        for i in range(len(nums)):
            if nums[i]==1:
                c+=1
                if c>maxc:
                    maxc=c
            else:
                c=0
        return maxc