class Solution{
    int rev(int x){
        int r=0;
        while(x>0){
            r=r*10+x%10;
            x/=10;
        }
        return r;
    }
    public int minMirrorPairDistance(int[] a){
        int n=a.length;
        Map<Integer,Integer> m=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int v=a[i];
            if(m.containsKey(v)){
                ans=Math.min(ans,i-m.get(v));
            }
            int r=rev(v);
            m.put(r,i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}