public class wildCard{
   
    public boolean isMatch(String s, String p) {
        boolean[][] match=new boolean[s.length()+1][p.length()+1];
        match[s.length()][p.length()]=true;
        char[] arrs = s.toCharArray();
        char[] arrp = p.toCharArray();
        for(int i=p.length()-1;i>=0;i--){
            if(arrs[i]!='*')
                break;
            else
                match[s.length()][i]=true;
        }
        for(int i=s.length()-1;i>=0;i--){
            for(int j=p.length()-1;j>=0;j--){
                if(arrs[i]==arrp[j]||arrp[j]=='?')
                        match[i][j]=match[i+1][j+1];
                else if(arrp[j]=='*')
                        match[i][j]=match[i+1][j]||match[i][j+1];
                else
                    match[i][j]=false;
            }
        }
        return match[0][0];
    }

    public static void main(String[] args) {
        
    }
}