public class addDigit258{

    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        return helper(num/10, num%10);
    }

    public int helper(int num, int num2){        
        int count = num + num2;
        if(count > 9){
            return helper(count/10, count%10);
        }
        else{
            return count;
        }
    }

    public static void main(String[] args){

    }
}