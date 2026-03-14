import java.util.*;
class Solution {
    List<String> ans=new ArrayList<>();
    public String getHappyString(int n,int k){
        build("",n);
        if(k>ans.size()) return "";
        return ans.get(k-1);
    }
    void build(String s,int n){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        char[] ch={'a','b','c'};
        for(char c:ch){
            if(s.length()>0 && s.charAt(s.length()-1)==c) continue;
            build(s+c,n);
        }
    }
}