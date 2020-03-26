public class reverseVowel {

    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int n = str.length - 1;
        int i = 0;
  
        while (i < n)
        {
            if (isVowels(str[i]) && isVowels(str[n]))
            {
                char temp = str[n];
                str[n] = str[i];
                str[i] = temp;
                i++;
                n--;
            }
            if (isVowels(str[i]) == false)
            {
                i++;
            }
            if (isVowels(str[n]) == false)
            {
                n--;
            }
        }
        String copy = String.copyValueOf(str);
        return copy;
    }
    public boolean isVowels(char target) {
        if (target == 'a' || target == 'e' || target == 'i' || target == 'o' || target == 'u' ||
                target == 'A' || target == 'E' || target == 'I' || target == 'O' || target == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}