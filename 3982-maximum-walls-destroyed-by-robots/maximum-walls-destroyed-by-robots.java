import java.util.*;

class Solution{
    public int maxWalls(int[]robots,int[]distance,int[]walls){
        int n=robots.length;
        int[][]a=new int[n+1][2];
        for(int i=0;i<n;i++){
            a[i][0]=robots[i];
            a[i][1]=distance[i];
        }
        Arrays.sort(a,0,n,(x,y)->x[0]-y[0]);
        Arrays.sort(walls);
        a[n][0]=(int)1e9;
        int[][]dp=new int[n][2];
        dp[0][0]=count(walls,a[0][0]-a[0][1],a[0][0]);
        if(n>1){
            dp[0][1]=count(walls,a[0][0],Math.min(a[1][0]-1,a[0][0]+a[0][1]));
        }else{
            dp[0][1]=count(walls,a[0][0],a[0][0]+a[0][1]);
        }
        for(int i=1;i<n;i++){
            int rightEnd=Math.min(a[i+1][0]-1,a[i][0]+a[i][1]);
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][1])+count(walls,a[i][0],rightEnd);
            int leftStart=Math.max(a[i][0]-a[i][1],a[i-1][0]+1);
            dp[i][0]=dp[i-1][0]+count(walls,leftStart,a[i][0]);
            int overlapStart=leftStart;
            int overlapEnd=Math.min(a[i-1][0]+a[i-1][1],a[i][0]-1);
            int val=dp[i-1][1]+count(walls,leftStart,a[i][0]);
            if(overlapStart<=overlapEnd){
                val-=count(walls,overlapStart,overlapEnd);
            }
            dp[i][0]=Math.max(dp[i][0],val);
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
    private int count(int[]arr,int l,int r){
        if(l>r)return 0;
        int left=lower(arr,l);
        int right=upper(arr,r);
        return right-left;
    }
    private int lower(int[]arr,int t){
        int l=0,h=arr.length;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m]<t)l=m+1;
            else h=m;
        }
        return l;
    }
    private int upper(int[]arr,int t){
        int l=0,h=arr.length;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m]<=t)l=m+1;
            else h=m;
        }
        return l;
    }
}