class Solution {
    public void sortColors(int[] a) {
        int i=0;
        int j=a.length-1;
        int x=0;
        while(x<=j){
             if(a[x]==0){
                int temp=a[i];
                a[i]=a[x];
                a[x]=temp;
                i++;
                x++;
            }
            else if(a[x]==2){
                int temp=a[j];
                a[j]=a[x];
                a[x]=temp;
                j--;
            
            }
             else{
                x++;
            }   
        }
    }
}