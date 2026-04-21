class Solution{
    int find(int x,int[] p){
        if(p[x]!=x)p[x]=find(p[x],p);
        return p[x];
    }
    void union(int a,int b,int[] p){
        int pa=find(a,p);
        int pb=find(b,p);
        if(pa!=pb)p[pa]=pb;
    }
    public int minimumHammingDistance(int[] s,int[] t,int[][] sw){
        int n=s.length;
        int[] p=new int[n];
        for(int i=0;i<n;i++)p[i]=i;
        for(int i=0;i<sw.length;i++){
            union(sw[i][0],sw[i][1],p);
        }
        Map<Integer,Map<Integer,Integer>> m=new HashMap<>();
        for(int i=0;i<n;i++){
            int root=find(i,p);
            if(!m.containsKey(root))m.put(root,new HashMap<>());
            Map<Integer,Integer> f=m.get(root);
            f.put(s[i],f.getOrDefault(s[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int root=find(i,p);
            Map<Integer,Integer> f=m.get(root);
            if(f.getOrDefault(t[i],0)>0){
                f.put(t[i],f.get(t[i])-1);
            }else{
                ans++;
            }
        }
        return ans;
    }
}