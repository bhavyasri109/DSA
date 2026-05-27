class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        freq = {}
        for num in nums:
            freq[num] = freq.get(num,0)+1
        heap = []
        for v,f in freq.items():
            heapq.heappush(heap,(-f,v))
        res = []
        for _ in range(k):
            res.append(heapq.heappop(heap)[1])
        return res
        
