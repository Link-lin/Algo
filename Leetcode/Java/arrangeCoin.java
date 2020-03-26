public class arrangeCoin{

    public static int arrangeCoins(int n) {
        int count = 0;
        int i = 0;
        while(count <= n){
            i++;
            count = ((1+i)*i)/2;
            System.out.println(count);
        }
        System.out.print(i);
        return i-1;
    }


    public static int arrangeCoin2(int n){
        return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
    }

    public static void main(String[] args){
        arrangeCoins(8);
    }
}