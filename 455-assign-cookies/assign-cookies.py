class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()
        gl=len(g)
        sl=len(s)
        i=0
        j=0
        c=0
        while i<gl and j<sl:
            if(g[i]<=s[j]):
                c+=1
                i+=1
            j+=1
        return c