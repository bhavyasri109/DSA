class Solution{
    int mod=1000000007;
    long pow(long b,long e){
        long r=1;
        while(e>0){
            if((e&1)==1)r=(r*b)%mod;
            b=(b*b)%mod;
            e>>=1;
        }
        return r;
    }
    long inv(long x){
        return pow(x,mod-2);
    }
    public int xorAfterQueries(int[] a,int[][] q){
        int n=a.length;
        int B=(int)Math.sqrt(n)+1;
        Map<Integer,List<int[]>> mp=new HashMap<>();
        for(int i=0;i<q.length;i++){
            int l=q[i][0];
            int r=q[i][1];
            int k=q[i][2];
            int v=q[i][3];
            if(k>=B){
                for(int j=l;j<=r;j+=k){
                    a[j]=(int)((1L*a[j]*v)%mod);
                }
            }else{
                if(!mp.containsKey(k))mp.put(k,new ArrayList<>());
                mp.get(k).add(q[i]);
            }
        }
        for(int k:mp.keySet()){
            List<int[]> list=mp.get(k);
            long[] d=new long[n];
            Arrays.fill(d,1);
            for(int i=0;i<list.size();i++){
                int[] cur=list.get(i);
                int l=cur[0];
                int r=cur[1];
                int v=cur[3];
                d[l]=(d[l]*v)%mod;
                int steps=(r-l)/k;
                int nx=l+(steps+1)*k;
                if(nx<n){
                    d[nx]=(d[nx]*inv(v))%mod;
                }
            }
            for(int i=0;i<n;i++){
                if(i>=k)d[i]=(d[i]*d[i-k])%mod;
                a[i]=(int)((1L*a[i]*d[i])%mod);
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
            x^=a[i];
        }
        return x;
    }
}