class Solution{
    public int countSubmatrices(int[][] g,int k){
        int m=g.length;
        int n=g[0].length;
        int a=0;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                g[i][j]+=g[i-1][j];
            }
        }
        for(int i=0;i<m;i++){
            int s=0;
            for(int j=0;j<n;j++){
                s+=g[i][j];
                if(s>k)break;
                a++;
            }
        }
        return a;
    }
}