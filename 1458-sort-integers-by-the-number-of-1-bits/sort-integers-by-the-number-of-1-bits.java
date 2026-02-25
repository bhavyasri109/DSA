class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp=new Integer[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b)->{
            int a_bitcount=Integer.bitCount(a);
            int b_bitcount=Integer.bitCount(b);
            if(a_bitcount==b_bitcount){
                return a-b;
            }
            return a_bitcount-b_bitcount;
        });

        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        return arr;
    }
}