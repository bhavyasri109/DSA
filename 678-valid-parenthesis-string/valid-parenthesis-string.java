class Solution {
    public boolean checkValidString(String s) {
        int minb=0;
        int maxb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                minb++;
                maxb++;
            }
            else if(s.charAt(i)==')'){
                minb--;
                maxb--;
            }
            else{
                minb--;
                maxb++;
            }
            if(maxb<0){
                return false;
            }
            if(minb<0){
                minb=0;
            } 
        }
        return minb==0;
    }
}