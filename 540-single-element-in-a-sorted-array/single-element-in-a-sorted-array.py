class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        hm={}
        for i in range(len(nums)):
            if nums[i] in hm:
                hm[nums[i]]+=1
            else:
                hm[nums[i]]=1
        res=0
        for key,val in hm.items():
            if val==1:
                res=key
        return res