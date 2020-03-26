public class exeltoTitle{

    public static  String convertToTitle(int n){
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            s.append((char)(n % 26 + 64));
            n /= 26;
        }
        String re = s.reverse().toString();
        return re;
    }

    public static void main(String[] args){
        String s = convertToTitle(28);
        System.out.print(s);
    }
}