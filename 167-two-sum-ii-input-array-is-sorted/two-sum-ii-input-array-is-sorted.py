class Solution:
    def twoSum(self,numbers:List[int],target:int)->List[int]:
        hm={}
        for i in range(len(numbers)):
            comp=target-numbers[i]
            if comp in hm:
                return [hm[comp]+1,i+1]
            hm[numbers[i]]=i