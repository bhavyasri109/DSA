import java.util.*;
class Solution{
    public int[] getBiggestThree(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        Set<Integer> set=new HashSet<>();
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                set.add(grid[r][c]);
                int size=1;
                while(true){
                    int top=r-size;
                    int bottom=r+size;
                    int left=c-size;
                    int right=c+size;
                    if(top<0||bottom>=n||left<0||right>=m) break;
                    int sum=0;
                    int i=top,j=c;
                    while(i<r&&j<right){
                        sum+=grid[i][j];
                        i++;j++;
                    }
                    while(i<bottom&&j>c){
                        sum+=grid[i][j];
                        i++;j--;
                    }
                    while(i>r&&j>left){
                        sum+=grid[i][j];
                        i--;j--;
                    }
                    while(i>top&&j<c){
                        sum+=grid[i][j];
                        i--;j++;
                    }
                    set.add(sum);
                    size++;
                }
            }
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        int k=Math.min(3,list.size());
        int[] ans=new int[k];
        for(int i=0;i<k;i++) ans[i]=list.get(i);
        return ans;
    }
}