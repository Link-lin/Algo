public class ImpleStrstr{

    public static int strStr(String haystack, String needle){
        if(needle == null || needle.length() == 0) return 0;
        int index = 0;
        while(index + needle.length() <= haystack.length()){
            if(haystack.charAt(index) == needle.charAt(0)){
                System.out.println(haystack.substring(index, index+needle.length()));
                if(haystack.substring(index, index+needle.length()).equals(needle)){
                    System.out.print(index);
                    return index;
                }
                
            }
            index ++;
        }
        return -1;
    }

    public static void main(String[] args){
        strStr("hello", "ll");
    }
}