class Solution{
    long getHeight(long time,int t){
        long l=0,r=100000;
        while(l<=r){
            long m=(l+r)/2;
            long need=(long)t*m*(m+1)/2;
            if(need<=time) l=m+1;
            else r=m-1;
        }
        return r;
    }
    public long minNumberOfSeconds(int h,int[] w){
        long left=0;
        long right=(long)1e18;
        long ans=right;
        while(left<=right){
            long mid=(left+right)/2;
            long total=0;
            for(int t:w){
                total+=getHeight(mid,t);
                if(total>=h) break;
            }
            if(total>=h){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}