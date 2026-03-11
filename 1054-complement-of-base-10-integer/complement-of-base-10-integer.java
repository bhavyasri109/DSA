class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String bits=Integer.toBinaryString(n);
        String re="";
        for(char c:bits.toCharArray()){
            if(c=='0'){
                re+='1';
            }
            else{
                re+='0';
            }
        }
        return Integer.parseInt(re,2);
    }
}