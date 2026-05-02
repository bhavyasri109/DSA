class Solution:
    def maximumUnits(self, boxTypes: List[List[int]], truckSize: int) -> int:
        cnt =0
        boxTypes.sort(key=lambda x:x[1],reverse=True)
        for box,units in boxTypes:
            if truckSize==0:
                break
            r=min(box,truckSize)
            cnt+=r*units
            truckSize-=r
        return cnt