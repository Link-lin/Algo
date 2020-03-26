public class uglyNumber{

    public static boolean isUgly(int num) {
        if (num == 1) return true;
        boolean s = false;
        
        while(num != -1 || num !=1){
            if(num %2 == 0){
                System.out.print("2" + num);
                num = num / 2;
                s = true;
            }
            if(num %3 == 0){
                System.out.print("3" + num);
                num = num / 3;
                s = true;
            }
            if(num % 5 == 0){
                System.out.print("5" + num);
                num = num / 5;
                s = true;
            }
            if(s == false){
                return false;
            }
            System.out.println(num);
            s = false;
        }
        return true;
    }

    public static void main(String[] args){
        isUgly(-2147483648);
    }
}