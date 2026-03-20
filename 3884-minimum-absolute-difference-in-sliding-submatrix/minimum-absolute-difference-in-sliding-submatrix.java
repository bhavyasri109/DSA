class Solution{
    public int[][] minAbsDiff(int[][] a,int k){
        int r=a.length;
        int c=a[0].length;
        int[][] res=new int[r-k+1][c-k+1];
        for(int i=0;i<=r-k;i++){
            for(int j=0;j<=c-k;j++){
                List<Integer> t=new ArrayList<>();
                for(int x=i;x<i+k;x++){
                    for(int y=j;y<j+k;y++){
                        t.add(a[x][y]);
                    }
                }
                if(k==1){
                    res[i][j]=0;
                    continue;
                }
                Collections.sort(t);
                List<Integer> u=new ArrayList<>();
                for(int v:t){
                    if(u.isEmpty()||u.get(u.size()-1)!=v){
                        u.add(v);
                    }
                }
                if(u.size()<=1){
                    res[i][j]=0;
                    continue;
                }
                int m=Integer.MAX_VALUE;
                for(int p=1;p<u.size();p++){
                    m=Math.min(m,Math.abs(u.get(p)-u.get(p-1)));
                }
                res[i][j]=m;
            }
        }
        return res;
    }
}