class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        heap = []
        for (i,j) in points:
            dist=(i**2)+(j**2)
            heapq.heappush(heap,(dist,[i,j]))
        res=[]
        for _ in range(k):
            res.append(heapq.heappop(heap)[1])
        return res