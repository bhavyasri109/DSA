class Solution:
    def countSubstrings(self, s: str) -> int:
        n=len(s)
        c=0
        dp=[[0]*n for i in range(n)]
        for i in range(n):
            dp[i][i]=1
            c+=1
        for i in range(n-1):
            if s[i]==s[i+1]:
                dp[i][i+1]=1
                c+=1
        for w in range(3,n+1):
            for i in range(n-w+1):
                j=w+i-1
                if s[i]==s[j] and dp[i+1][j-1]==1:
                    dp[i][j]=1
                    c+=1
        return c