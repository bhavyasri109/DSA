class Solution{
    public int minimumDistance(int[] a){
        int n=a.length;
        Map<Integer,int[]> m=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int v=a[i];
            if(!m.containsKey(v)){
                m.put(v,new int[]{-1,-1});
            }
            int[] p=m.get(v);
            if(p[0]!=-1&&p[1]!=-1){
                ans=Math.min(ans,2*(i-p[0]));
            }
            p[0]=p[1];
            p[1]=i;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}