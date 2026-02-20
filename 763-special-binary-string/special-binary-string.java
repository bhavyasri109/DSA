class Solution {
    public String makeLargestSpecial(String s) {
        List<String> blocks=new ArrayList<>();
        int b=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                b++;
            }
            else{
                b--;
            }
            if(b==0){
                String inner=makeLargestSpecial(s.substring(st+1,i));
                blocks.add("1"+inner+"0");
                st=i+1;
            }
            
        }
        Collections.sort(blocks,Collections.reverseOrder());
        StringBuilder re=new StringBuilder();
        for(String bl:blocks){
            re.append(bl);
        }
        return re.toString();
    }
}