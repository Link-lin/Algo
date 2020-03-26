import java.util.*;

public class longPalind {

    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(int i =0; i < s.length(); i++){
           char temp = s.charAt(i);
            if(set.contains(temp)){
                set.remove(temp);
                count +=2; 
            }
            else{
                set.add(temp);
            }
        }
        return (set.isEmpty()) ? count : count+1;
    }

    public int longestPalindrome2(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int[] lowercase = new int[26];
        int[] uppercase = new int[26];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= 97)
                lowercase[temp - 'a']++;
            else
                uppercase[temp - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            res += (lowercase[i] / 2) * 2;
            res += (uppercase[i] / 2) * 2;
        }
        return res == s.length() ? res : res + 1;
    }

    public static void main(String[] args) {

    }
}