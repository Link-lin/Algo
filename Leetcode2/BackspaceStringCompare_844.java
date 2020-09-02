public class BackspaceStringCompare_844 {

    public static String translateBackspace(String s) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else {
                if (count != 0){
                    count --;
                    continue;
                }
                else{
                    builder.append(s.charAt(i));
                }
            }
        }
        return builder.toString();
    }

    public static boolean backspaceCompare(String S, String T) {
        return translateBackspace(S).equals(translateBackspace(T));
    }

    public static void main(String[] args) {
       

        String s = translateBackspace( "bxj##tw");
         String t = translateBackspace("bxo#j##tw");
        System.out.println(s.equals(t));
        System.out.println(s);
        //System.out.println(t);
    }

}
