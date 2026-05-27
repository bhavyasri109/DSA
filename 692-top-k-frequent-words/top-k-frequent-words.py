class Solution:
    def topKFrequent(self, words: List[str], k: int) -> List[str]:
        heap=[]
        freq={}
        for word in words:
            freq[word]=freq.get(word,0)+1
        for w,f in freq.items():
            heapq.heappush(heap,(-f,w))
        res=[]
        for _ in range(k):
            res.append(heapq.heappop(heap)[1])
        return res