public class regularMatch{

    public static boolean isMatch(String s, String p){
        
        int pl = p.length();
        int sl = s.length();
        if(p==null || pl == 0) return (sl==0 || s==null);
        char[] sa = s.toCharArray();
        char[] pa = p.toCharArray();

        boolean[][] result =  new boolean[sl+1][pl+1];
        result[0][0] = true;

        for (int j=2; j<=pl; j++) {
            result[0][j] = pa[j-1] == '*' && result[0][j-2]; 
        }

        for(int j = 1; j <= pl; j++){
            for(int i =1; i <= sl; i++){
                if(pa[j-1] == sa[i-1] || pa[j-1]=='.'){
                    result[i][j] = result[i-1][j-1];
                }
                else if(pa[j-1] == '*'){
                    result[i][j] = result[i][j-2] || ((sa[i-1] == pa[j-2] || pa[j-2] == '.') && result[i-1][j]);
                }
            }
        }

        for(int k =0; k < sl+1; k++){
            for(int l =0; l < pl+1; l++){
                System.out.print(result[k][l] +",");
            }
            System.out.println();
        }
        return result[sl][pl];
    }

    public static void main(String[] args){
        String s = "";
        String p = "a*";
        isMatch(s,p);
    }
}