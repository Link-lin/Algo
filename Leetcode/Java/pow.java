public class pow{

    public static double myPow(double x, int n){
        double result = 1;
        if(n == 1) return x;
        if(x == 1) return 1;
        if(x == -1) return (n%2 ==0) ? 1: -1;

        if(n >0){
            for(int i =0; i < n; i++){
                result *= x;
                if(result < 0.0000001 && result > -0.0000001){
                    return 0;
                }
            }
        }
        if(n < 0){
            for(int i =0; i > -n; i--){
                result /= x;
                if(result < 0.0000001 && result > -0.0000001){
                    return 0;
                }
            }
        }
        return result;
    }

    public static double mypow2(double x, int n){
        double result =1;
        if(n == 1) return x;
        if(x == 1) return 1;
        if(x == -1) return (n%2 ==0) ? 1: -1;

        int power = Math.abs(n);
        if(power == Integer.MIN_VALUE){
            power = Integer.MAX_VALUE;
            result = x;
        }

        double multiple = x;
        while(power > 0){
            if((power & 1) != 0){
                result *= multiple;
            }

            multiple *= multiple;
            power >>= 1;
        }

        return n > 0? result: 1.0 / result;
    }
    
    public static void main(String[] args){
        double re = myPow(2, -2147483648);
        System.out.print(re);
    }
}