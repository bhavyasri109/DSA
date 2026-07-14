class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        t=""
        for ch in s:
            if ch.isalnum():
                t+=ch
        i=0
        j=len(t)-1
        while(i<j):
            if t[i]!=t[j]:
                return False
            i+=1
            j-=1
        return True