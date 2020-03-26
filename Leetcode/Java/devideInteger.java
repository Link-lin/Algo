public class devideInteger{

    public int divide(int dividend, int divisor) {
        if(divisor ==1 ) return dividend;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor > 0 && dividend>0) return dividehelper(-dividend, -divisor);
        else if(dividend>0) return dividehelper(-dividend, divisor);
        else if(divisor>0) return dividehelper(dividend, -divisor);
        else return dividehelper(dividend, divisor);
    }
    private int dividehelper(int dividend, int divisor){
        // base case
        if(divisor < dividend) return 0;
        // get highest digit of divisor
        int cur = 0, res = 0;
        while((divisor << cur) >= dividend && divisor << cur < 0 && cur < 31) cur++;
        res = dividend - (divisor << cur-1);
        if(res > divisor) return 1 << cur-1;
        return (1 << cur-1)+divide(res, divisor);
    }
    /*
    public int dividehelper(int dividend, int divisor){
        System.out.println("divisor: "+ divisor +",dividend: "+ dividend);
        if(divisor < dividend) return 0;
        int shift = 0;
        int x = divisor;
        while(x >= dividend){
            shift++;
            x = x<<1;
        }
        System.out.println(shift);
        int remain = dividend - x;
        int count = (int)Math.pow(2, shift);
        if(remain == 0) return count;
        System.out.println("x: " + x+" remain: " + remain + " count: " + count);
        while(x >= dividend){
            count++;
            x += divisor; 
        }
        System.out.println(count);
        return count;
    }
    */
    public static void main(String[] args){
        devideInteger x = new devideInteger();
        int result = x.divide(-2147483648,2);
        System.out.print(result);
    }
}