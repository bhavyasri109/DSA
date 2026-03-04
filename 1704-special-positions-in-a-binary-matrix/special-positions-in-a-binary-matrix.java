class Solution {
    public int numSpecial(int[][] a) {
        int rows=a.length;
        int cols=a[0].length;
        int[] r=new int[rows];
        int[] c=new int[cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(a[i][j]==1) {
                    r[i]++;
                    c[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(a[i][j]==1&&r[i]==1&&c[j]==1) {
                    ans++;
                }
            }
        }
        return ans;
    }
}