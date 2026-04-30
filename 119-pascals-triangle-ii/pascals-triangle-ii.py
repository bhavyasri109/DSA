class Solution:
    def getRow(self, n: int) -> List[int]:
        dp=[[1]*(i+1) for i in range(n+1)]
        for i in range(2,n+1):
            for j in range(1,i):
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1]
        return dp[n]