class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        el=[]
        ol=[]
        for i in range(len(nums)):
            if(i%2==0):
                el.append(nums[i])
            else:
                ol.append(nums[i])
        el.sort()
        ol.sort(reverse=True)
        e=0
        o=0
        for i in range(len(nums)):
            if i%2==0:
                nums[i]=el[e]
                e+=1
            else:
                nums[i]=ol[o]
                o+=1
        return nums