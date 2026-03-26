class Solution{
    public boolean canPartitionGrid(int[][] a){
        int r=a.length,c=a[0].length;
        long tot=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                tot+=a[i][j];
            }
        }
        Map<Long,Integer> up=new HashMap<>();
        Map<Long,Integer> down=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                long v=a[i][j];
                down.put(v,down.getOrDefault(v,0)+1);
            }
        }
        long cur=0;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c;j++){
                long v=a[i][j];
                cur+=v;
                up.put(v,up.getOrDefault(v,0)+1);
                down.put(v,down.get(v)-1);
                if(down.get(v)==0)down.remove(v);
            }
            long other=tot-cur;
            if(cur==other)return true;
            long need1=2*cur-tot;
            if(check(need1,0,i,0,c-1,up,a))return true;
            long need2=tot-2*cur;
            if(check(need2,i+1,r-1,0,c-1,down,a))return true;
        }
        down.clear();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                long v=a[i][j];
                down.put(v,down.getOrDefault(v,0)+1);
            }
        }
        Map<Long,Integer> left=new HashMap<>();
        cur=0;
        for(int j=0;j<c-1;j++){
            for(int i=0;i<r;i++){
                long v=a[i][j];
                cur+=v;
                left.put(v,left.getOrDefault(v,0)+1);
                down.put(v,down.get(v)-1);
                if(down.get(v)==0)down.remove(v);
            }
            long other=tot-cur;
            if(cur==other)return true;
            long need1=2*cur-tot;
            if(check(need1,0,r-1,0,j,left,a))return true;
            long need2=tot-2*cur;
            if(check(need2,0,r-1,j+1,c-1,down,a))return true;
        }
        return false;
    }
    private boolean check(long v,int r1,int r2,int c1,int c2,Map<Long,Integer> f,int[][] g){
        if(v<=0||!f.containsKey(v))return false;
        int h=r2-r1+1,w=c2-c1+1;
        if(h==1&&w>1)return g[r1][c1]==v||g[r1][c2]==v;
        if(w==1&&h>1)return g[r1][c1]==v||g[r2][c1]==v;
        if(h==1&&w==1)return g[r1][c1]==v;
        return true;
    }
}