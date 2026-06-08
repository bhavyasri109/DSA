class Solution:
    def majorityElement(self, arr: List[int]) -> int:
        n=len(arr)
        floor=n/2
        hm={}
        res=0
        for i in range(n):
            if arr[i] in hm:
                hm[arr[i]]+=1
            else:
                hm[arr[i]]=1
        for key,val in hm.items():
            if val>floor:
                res=key
        return res