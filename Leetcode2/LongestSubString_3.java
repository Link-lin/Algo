import java.util.*;

public class LongestSubString_3 {

    /**
     * HashMap solution O(n) but not fast
     * @param s
     * @return
     */
    public static int lengthOfLongestSubString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        if(s.length()== 1) return 1;

        for(int i =0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            max = Math.max(max, i-left+1); 
            map.put(s.charAt(i), i);
        }
        return max;
    }

    public static int lengthOfLongestSubString2(String s){
        int arr[] = new int[256];
        int max =0, m =0;

        for(int i =0; i< arr.length; i++){
            arr[i] = -1;
        }

        for(int i =0; i < s.length(); i++){
            m = Math.max(arr[s.charAt(i)]+1, m);
            arr[s.charAt(i)]= i;
            max = Math.max(max, i-m +1);
        }

        return max;
    }

    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubString2("abcdeaaddsefds")); 
    }
}