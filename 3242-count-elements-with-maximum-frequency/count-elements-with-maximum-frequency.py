class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        hm={}
        for i in range(len(nums)):
            if nums[i] in hm:
                hm[nums[i]]+=1
            else:
                hm[nums[i]]=1
        maxf=max(hm.values())
        c=0
        for key,val in hm.items():
            if val==maxf:
                c+=val
        return c
