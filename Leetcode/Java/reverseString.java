public class reverseString {

    public static void reverseStringI(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void main(String[] args) {
        char[] a = "Hello".toCharArray();
        reverseStringI(a);
    }
}