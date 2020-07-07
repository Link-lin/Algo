public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int old = x;
        int n = 0;
        while (x != 0) {
            int a = x % 10;
            n = n * 10 + a;
            x = x / 10;
        }
        return old == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

}
