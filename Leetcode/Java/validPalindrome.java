public class validPalindrome{
    

    public static boolean isAlpha(char c){
        return (c>= 'A' && c<='Z') && (c >='0' && c<= '9');
    }
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        char[] temp = s.toUpperCase().toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            char leftc = temp[left];
            char rightc = temp[right];
            if (!isAlpha(leftc)) { 
                left++;
            } else if (!isAlpha(rightc)) {
                right--;
            } else if (leftc != rightc) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isPalindrome2(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder string = new StringBuilder("");
        for (char c : charArray) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                string.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                string.append((char)(c + 32));
            }
        }
        return string.toString().equals(string.reverse().toString());
    }

    public static void main(String[] args){
        String s = "race a car";
        isPalindrome(s);
    }
}