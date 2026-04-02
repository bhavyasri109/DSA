class Solution{
    public int maximumAmount(int[][]grid){
        int m=grid.length,n=grid[0].length;
        int[][][]dp=new int[m][n][3];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=Integer.MIN_VALUE;
                }
            }
        }
        dp[0][0][0]=grid[0][0];
        if(grid[0][0]<0)dp[0][0][1]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<3;k++){
                    if(dp[i][j][k]==Integer.MIN_VALUE)continue;
                    if(i+1<m){
                        int val=grid[i+1][j];
                        dp[i+1][j][k]=Math.max(dp[i+1][j][k],dp[i][j][k]+val);
                        if(val<0&&k<2){
                            dp[i+1][j][k+1]=Math.max(dp[i+1][j][k+1],dp[i][j][k]);
                        }
                    }
                    if(j+1<n){
                        int val=grid[i][j+1];
                        dp[i][j+1][k]=Math.max(dp[i][j+1][k],dp[i][j][k]+val);
                        if(val<0&&k<2){
                            dp[i][j+1][k+1]=Math.max(dp[i][j+1][k+1],dp[i][j][k]);
                        }
                    }
                }
            }
        }
        return Math.max(dp[m-1][n-1][0],Math.max(dp[m-1][n-1][1],dp[m-1][n-1][2]));
    }
}