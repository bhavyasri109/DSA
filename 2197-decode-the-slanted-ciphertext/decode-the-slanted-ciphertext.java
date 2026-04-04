class Solution{
    public String decodeCiphertext(String s,int rows){
        int n=s.length();
        int cols=n/rows;
        char[][]mat=new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=s.charAt(k++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<cols;j++){
            int i=0,col=j;
            while(i<rows&&col<cols){
                sb.append(mat[i][col]);
                i++;
                col++;
            }
        }
        int end=sb.length()-1;
        while(end>=0&&sb.charAt(end)==' ')end--;
        return sb.substring(0,end+1);
    }
}