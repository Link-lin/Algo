/**
 * reverseWord3
 */
public class reverseWord3 {

    public String reverseWords(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        // convert string to char array
        char[] chars = s.toCharArray();

        // two pointers
        int start = 0;
        int end = 0;

        // scan char array and look for each word and reverse it
        for (int i = 0; i < chars.length; i++) {
            if (chars[start] == ' ') {
                start++;
                end = start;
            } else if (chars[i] != ' ') {
                end = i;
                if (end == chars.length - 1) {
                    reverseWord(chars, start, end);
                }
            } else {
                reverseWord(chars, start, end);
                start = ++end;
            }
        }

        // convert to string
        return new String(chars);
    }

    // reverse word
    private void reverseWord(char[] chars, int start, int end) {
        while (start < end) {
            char c = chars[start];
            chars[start++] = chars[end];
            chars[end--] = c;
        }
    }

    public static void main(String[] args) {
    }
}