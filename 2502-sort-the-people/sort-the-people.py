class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        items=[]
        for i in range(len(heights)):
            items.append((names[i],heights[i]))
        items.sort(key=lambda item:item[-1],reverse=True)
        res=[]
        for item in items:
            res.append(item[0])
        return res