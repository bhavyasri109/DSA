import java.util.*;
class Solution{
    class DSU{
        int[] p;
        int[] r;
        DSU(int n){
            p=new int[n];
            r=new int[n];
            for(int i=0;i<n;i++){
                p[i]=i;
            }
        }
        int find(int x){
            if(p[x]==x){
                return x;
            }
            p[x]=find(p[x]);
            return p[x];
        }
        boolean union(int a,int b){
            int pa=find(a);
            int pb=find(b);
            if(pa==pb){
                return false;
            }
            if(r[pa]<r[pb]){
                int t=pa;
                pa=pb;
                pb=t;
            }
            p[pb]=pa;
            if(r[pa]==r[pb]){
                r[pa]++;
            }
            return true;
        }
    }
    public int maxStability(int n,int[][] e,int k){
        DSU d=new DSU(n);
        int comp=n;
        int min=Integer.MAX_VALUE;
        List<int[]> opt=new ArrayList<>();
        for(int[] x:e){
            int u=x[0];
            int v=x[1];
            int w=x[2];
            int t=x[3];
            if(t==1){
                if(!d.union(u,v)){
                    return -1;
                }
                comp--;
                min=Math.min(min,w);
            }
            else{
                opt.add(x);
            }
        }
        opt.sort((a,b)->b[2]-a[2]);
        List<Integer> use=new ArrayList<>();
        for(int[] x:opt){
            int u=x[0];
            int v=x[1];
            int w=x[2];
            if(d.union(u,v)){
                use.add(w);
                comp--;
                if(comp==1){
                    break;
                }
            }
        }
        if(comp>1){
            return -1;
        }
        Collections.sort(use);
        int ans=min;
        for(int w:use){
            int val=w;
            if(k>0){
                val=val*2;
                k--;
            }
            if(ans==Integer.MAX_VALUE){
                ans=val;
            }
            else{
                ans=Math.min(ans,val);
            }
        }
        return ans;
    }
}