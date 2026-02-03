class Solution {
    public int maxTurbulenceSize(int[] a) {
        int up=1;
        int down=1;
        int re=1;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]){
                up=down+1;
                down=1;
            }
            else if(a[i]<a[i-1]){
                down=up+1;
                up=1;
            }
            else{
                down=up=1;
            }
            re=Math.max(re,Math.max(up,down));
        }
        return re;
    }
}