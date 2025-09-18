class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int rem=0;
        if(x < 0 && x % 10 == 0){
            return false;
        }
        else{
            int ori=x;
            while(x>0){
                rem=x%10;
                rev=rev*10+rem;
                x/=10;
            }
            return rev==ori;
        }
    }
}