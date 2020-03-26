public class ransomnode{

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] t = new int[26];
        char[] magchar = magazine.toCharArray();
        char[] ransomchar = ransomNote.toCharArray();

        for(int j = 0; j < magazine.length(); j++){
            t[magchar[j]-'a'] ++;
        }
        for(int i = 0; i < ransomNote.length(); i++){
            int index = ransomchar[i] -'a';
            t[index] --;
            if(t[index] < 0) return false;
        }
       return true;
    }

    public static void main(String[] args){
        String ransomNote = "ab";
        String magazine = "aabb";
        canConstruct(ransomNote, magazine);
    }
}
