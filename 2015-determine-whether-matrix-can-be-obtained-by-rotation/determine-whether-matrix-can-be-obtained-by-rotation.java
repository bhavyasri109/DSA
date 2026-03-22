class Solution{
    public boolean findRotation(int[][] a,int[][] b){
        int n=a.length;
        for(int r=0;r<4;r++){
            for(int i=0;i<n/2;i++){
                for(int j=0;j<(n+1)/2;j++){
                    int t=a[i][j];
                    a[i][j]=a[n-1-j][i];
                    a[n-1-j][i]=a[n-1-i][n-1-j];
                    a[n-1-i][n-1-j]=a[j][n-1-i];
                    a[j][n-1-i]=t;
                }
            }
            if(check(a,b))return true;
        }
        return false;
    }
    private boolean check(int[][] a,int[][] b){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j])return false;
            }
        }
        return true;
    }
}