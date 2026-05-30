class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x : x[1])
        prevend=intervals[0][1]
        c=0
        for i in range(1,len(intervals)):
            s,e=intervals[i]
            if(s>=prevend):
                prevend=e
            else:
                c+=1
        return c
