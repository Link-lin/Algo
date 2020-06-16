public class RomanToInteger_13 {

    public static int romanToInt(String s) {
        int re = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = singleRomanConvert(s.charAt(i));
            if ((cur == 1 || cur == 10 || cur == 100) && i != s.length() - 1) {
                int next = singleRomanConvert(s.charAt(i + 1));
                if (cur < next) {
                    re += next - cur;
                    i += 1;
                    continue;
                }
            }
            re += cur;
        }
        return re;
    }

    public static int singleRomanConvert(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}