class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hm={}
        for i in range(len(nums)):
            if nums[i] in hm:
                return True
            hm[nums[i]]=1
        return False

