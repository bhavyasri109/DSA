class Solution:
    def isScramble(self, s1: str, s2: str) -> bool:
        @cache
        def dfs(s1,s2):
            if s1==s2:
                return True
            if sorted(s1)!=sorted(s2):
                return False
            if len(s1)==1 or len(s2)==1:
                return False
            for i in range(1,len(s1)):
                j=len(s2)-i
                if(dfs(s1[:i],s2[:i]) and dfs(s1[i:],s2[i:])) or (dfs(s1[i:],s2[:j]) and dfs(s1[:i],s2[j:])):
                    return True
            return False
        return dfs(s1,s2)