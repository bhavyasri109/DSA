class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ma=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    ma[i][j]=matrix[i][j];
                }
                else if(matrix[i][j]!=0){
                    ma[i][j]=ma[i-1][j]+1;
                }
                else{
                    ma[i][j]=0;
                }
            }
        }
        int re=0;
        for(int i=0;i<m;i++){
            Arrays.sort(ma[i]);
            for(int j=0;j<n;j++){
                int h=ma[i][n-1-j];
                int w=j+1;
                re=Math.max(re,h*w);
            }
        }
        return re;
    }
}