public class Nthdigit{

    public static int findNthDigit(int n) {
        int start = 1;
        int range = 9;
        int len = 1;
        while(n > len*range){
            n -= len*range;
            len++;
            start *= 10;
            range *= 10;
        }
        start += (n-1)/len;
        String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % len));
    }
    public static void main(String[] args){
        findNthDigit(190);
    }
}