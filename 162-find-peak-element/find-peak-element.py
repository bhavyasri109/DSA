class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        maxi=nums[0]
        p=0
        for i in range(len(nums)):
            if nums[i]>maxi:
                maxi=nums[i]
                p=i
        return p