import java.util.*;

public class letterComb{

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> re = new LinkedList<String>();
		if(digits.isEmpty()) return re;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        re.add("");
        for(int i =0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(re.peek().length()==i){
				String t = re.remove();
				for(char s : mapping[index].toCharArray())
					re.add(t+s);
			}
        }
        return re;
    }
    public static void main(String[] args){
    }
}