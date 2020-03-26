public class climbStairs{

    private static int fib(int x){
        if(x <=1){
            return 1;
        }
        return fib(x-1) + fib(x-2);
    }

    public static int climbStair(int n){
        int re = fib(n);

        return re;
    }

    public static int climb2(int n){
        if(n ==1) return 1;
        int first = 1;
        int second =1;
        int third;
        for(int i =2; i <= n; i++){
            third = first +second;
            first = second; 
            second = third;
        }
        return second;
    }

    public static void main(String[] args){
        int result = climb2(5);
        System.out.println(result);
    }
}