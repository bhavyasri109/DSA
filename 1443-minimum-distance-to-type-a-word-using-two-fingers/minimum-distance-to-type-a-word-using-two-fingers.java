class Solution{
    int dist(int a,int b){
        if(a==-1)return 0;
        int x1=a/6,y1=a%6;
        int x2=b/6,y2=b%6;
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
    public int minimumDistance(String s){
        int n=s.length();
        int[] dp=new int[26];
        for(int i=0;i<26;i++)dp[i]=1000000;
        int res=0;
        int prev=-1;
        for(int i=0;i<n;i++){
            int cur=s.charAt(i)-'A';
            int[] ndp=new int[26];
            for(int j=0;j<26;j++)ndp[j]=1000000;
            for(int j=0;j<26;j++){
                if(dp[j]==1000000)continue;
                int use1=dp[j]+dist(prev,cur);
                ndp[j]=Math.min(ndp[j],use1);
                int use2=dp[j]+dist(j,cur);
                ndp[prev==-1?cur:prev]=Math.min(ndp[prev==-1?cur:prev],use2);
            }
            if(prev==-1){
                for(int j=0;j<26;j++){
                    ndp[j]=Math.min(ndp[j],0);
                }
            }
            dp=ndp;
            prev=cur;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<26;i++)ans=Math.min(ans,dp[i]);
        return ans;
    }
}