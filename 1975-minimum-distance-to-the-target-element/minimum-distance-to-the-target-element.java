class Solution{
    public int getMinDistance(int[] a,int t,int s){
        int n=a.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==t){
                int d=Math.abs(i-s);
                if(d<ans)ans=d;
            }
        }
        return ans;
    }
}