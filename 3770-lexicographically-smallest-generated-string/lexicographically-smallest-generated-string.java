class Solution{
    public String generateString(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        char[]res=new char[n+m-1];
        boolean[]fix=new boolean[n+m-1];
        for(int i=0;i<res.length;i++)res[i]='a';
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='T'){
                for(int j=0;j<m;j++){
                    if(res[i+j]=='a'||res[i+j]==str2.charAt(j)){
                        res[i+j]=str2.charAt(j);
                        fix[i+j]=true;
                    }else return "";
                }
            }
        }
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='F'){
                boolean same=true;
                for(int j=0;j<m;j++){
                    if(res[i+j]!=str2.charAt(j)){
                        same=false;
                        break;
                    }
                }
                if(same){
                    boolean changed=false;
                    for(int j=m-1;j>=0;j--){
                        if(!fix[i+j]){
                            res[i+j]=res[i+j]=='a'?'b':'a';
                            changed=true;
                            break;
                        }
                    }
                    if(!changed)return "";
                }
            }
        }
        for(int i=0;i<n;i++){
            boolean same=true;
            for(int j=0;j<m;j++){
                if(res[i+j]!=str2.charAt(j)){
                    same=false;
                    break;
                }
            }
            if(str1.charAt(i)=='T'&&!same)return "";
            if(str1.charAt(i)=='F'&&same)return "";
        }
        return new String(res);
    }
}