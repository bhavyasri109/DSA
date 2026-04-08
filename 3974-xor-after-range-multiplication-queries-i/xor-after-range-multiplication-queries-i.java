class Solution{
    public int xorAfterQueries(int[] a,int[][] q){
        int n=a.length;
        int mod=1000000007;
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            int k=q[i][2];
            int v=q[i][3];
            for(int j=l;j<=r;j+=k){
                a[j]=(int)(((long)a[j]*v)%mod);
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
            x^=a[i];
        }
        return x;
    }
}