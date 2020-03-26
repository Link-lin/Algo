import java.util.*;

public class generatePara{

    public List<String> generateParenthesis(int n) {
         List<String> re = new ArrayList<>();
         String s = "";
         backtrack(re,s,n,0,0);
         return re;
    }

    public void backtrack(List<String> re,String s, int count, int open, int close){
        if(s.length() == count*2){
            re.add(s);
        }
        if(open < count){
            backtrack(re, s+"(", count, open+1, close);
        }
        if(close < open){
            backtrack(re, s+")", count, open, close+1);
        }
    }

    public static void main(String[] args){
        generatePara s = new generatePara();
        List<String> list = s.generateParenthesis(3);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}