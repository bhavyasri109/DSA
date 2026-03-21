class Solution{
    public int[][] reverseSubmatrix(int[][] a,int x,int y,int k){
        for(int j=y;j<y+k;j++){
            int t=x;
            int b=x+k-1;

            while(t<b){
                swap(a,t,b,j);
                t++;
                b--;
            }
        }
        return a;
    }
    public void swap(int[][] a,int i,int j,int c){
        int v=a[i][c];
        a[i][c]=a[j][c];
        a[j][c]=v;
    }
}