/**
 * isSubsequence
 */
public class isSubsequence {

    public static boolean isSubsequence1(String s, String t){
        char [] sarr = s.toCharArray();
        char [] tarr = t.toCharArray();
        if(sarr.length == 0) return true;
        int count = 0;
        for(int i =0; i < tarr.length; i++){
            if(tarr[i] == sarr[count]){
                count ++;
                if(count == sarr.length) break;
            }
        }
        return count==sarr.length;
    }

    public static void main(String[] args) {
        System.out.print(isSubsequence1("acb", "ahbgdc")); 
    }
}