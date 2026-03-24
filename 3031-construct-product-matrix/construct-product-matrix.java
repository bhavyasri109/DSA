class Solution{
    public int[][] constructProductMatrix(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int size=n*m;
        int[] arr=new int[size];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        long[] pre=new long[size];
        long[] suf=new long[size];
        pre[0]=1;
        for(int i=1;i<size;i++){
            pre[i]=(pre[i-1]*arr[i-1])%12345;
        }
        suf[size-1]=1;
        for(int i=size-2;i>=0;i--){
            suf[i]=(suf[i+1]*arr[i+1])%12345;
        }
        int[][] res=new int[n][m];
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=(int)((pre[k]*suf[k])%12345);
                k++;
            }
        }
        return res;
    }
}