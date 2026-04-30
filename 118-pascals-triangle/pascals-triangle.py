class Solution:
    def generate(self, n: int) -> List[List[int]]:
        dp=[[1]*(i+1) for i in range(n)]
        for i in range(2,n):
            for j in range(1,i):
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1]
        return dp