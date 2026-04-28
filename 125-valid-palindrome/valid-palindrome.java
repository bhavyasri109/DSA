class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder res=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                res.append(Character.toLowerCase(ch));
            }
        }
        int l=0,r=res.length()-1;
        while(l<r){
            if(res.charAt(l)!=res.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}