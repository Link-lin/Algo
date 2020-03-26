/**
 * validPalindrome2
 */
public class validPalindrome2 {

    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r))
                return isPalindromic(s, l, r + 1) || isPalindromic(s, l - 1, r);
        return true;
    }

    public boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r))
                return false;
        return true;
    }

    public boolean validPalindrome1(String s) {
        return helper(s, 0, s.length() - 1, 0);
    }

    public boolean helper(String s, int l, int h, int step) {
        if (step > 1)
            return false;
        while (l < h) {
            if (s.charAt(l) == s.charAt(h)) {
                l++;
                h--;
            } else
                return helper(s, l + 1, h, step + 1) || helper(s, l, h - 1, step + 1);
        }
        return true;
    }

    public static void main(String[] args) {

    }
}