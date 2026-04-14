class Solution{
    public long minimumTotalDistance(List<Integer> r,int[][] f){
        int n=r.size();
        int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=r.get(i);
        Arrays.sort(a);
        Arrays.sort(f,(x,y)->x[0]-y[0]);
        int m=f.length;
        long[][] dp=new long[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=Long.MAX_VALUE/2;
            }
        }
        for(int j=0;j<=m;j++)dp[0][j]=0;
        for(int j=1;j<=m;j++){
            int pos=f[j-1][0];
            int lim=f[j-1][1];
            for(int i=0;i<=n;i++){
                dp[i][j]=dp[i][j-1];
                long cost=0;
                for(int k=1;k<=lim&&k<=i;k++){
                    cost+=Math.abs(a[i-k]-pos);
                    dp[i][j]=Math.min(dp[i][j],dp[i-k][j-1]+cost);
                }
            }
        }
        return dp[n][m];
    }
}