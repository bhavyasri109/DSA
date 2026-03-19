class Solution{
    public int numberOfSubmatrices(char[][] a){
        int r=a.length;
        int c=a[0].length;
        int[][] s=new int[r][c];
        int[][] x=new int[r][c];
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int v=0,p=0;
                if(a[i][j]=='X'){
                    v=1;
                    p=1;
                }
                else if(a[i][j]=='Y'){
                    v=-1;
                }
                s[i][j]=v;
                x[i][j]=p;
                if(i>0){
                    s[i][j]+=s[i-1][j];
                    x[i][j]+=x[i-1][j];
                }
                if(j>0){
                    s[i][j]+=s[i][j-1];
                    x[i][j]+=x[i][j-1];
                }
                if(i>0&&j>0){
                    s[i][j]-=s[i-1][j-1];
                    x[i][j]-=x[i-1][j-1];
                }
                if(s[i][j]==0&&x[i][j]>0)ans++;
            }
        }
        return ans;
    }
}