/**
 * addString
 */
public class addString {

    public static String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        StringBuffer builder = new StringBuffer();
        int l1 = n1.length - 1, l2 = n2.length - 1;
        int carryIn = 0;
        while (l1 != -1 || l2 != -1 || carryIn != 0) {
            if (l1 == -1 && l2 == -1) {
                carryIn = cal(builder, '0', '0', carryIn) ? 1: 0;
            } else if (l1 == -1) {
                carryIn = cal(builder, '0', n2[l2], carryIn) ? 1 : 0;
                l2--;
            } else if (l2 == -1) {
                 carryIn= cal(builder, n1[l1], '0', carryIn) ? 1 : 0;
                l1--;
            } else {
                carryIn = cal(builder, n1[l1], n2[l2], carryIn) ? 1 : 0;
                l1--; l2--;
            }
        }
        return builder.reverse().toString();
    }

    public static boolean cal(StringBuffer builder, char a, char b, int carry) {
        System.out.println(a + " " + b + " " + carry);
        int res = a - '0' + b - '0' + carry;
        builder.append(res % 10);
        return res >= 10;
    }

    public static void main(String[] args) {
        System.out.print(addStrings("1", "9"));
    }
}