class Solution:
    def firstUniqChar(self, s: str) -> int:
        re=-1
        for i in range(len(s)):
            if s.count(s[i])==1:
                re=i
                break
        return re