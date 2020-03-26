import java.util.Arrays;

public class PlusOne{
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] result;
        if(digits[length-1] != 9){
            digits[length-1] += 1;
            result = digits;
        }
        else{
            int carry = 1;
            digits[length-1] = 0;
            for(int i = length-2; i >=0 ; i--){
                if(digits[i] == 9 && carry == 1){
                    carry = 1;
                    digits[i] = 0;
                }
                else if(carry == 1 && (digits[i] != 9)){
                    carry = 0;
                    digits[i] ++; 
                }
            }
            result = digits;
            if(carry ==1){
                int[] newarr = Arrays.copyOf(digits, length+1);
                newarr[0] = 1;
                System.arraycopy(digits, 0, newarr, 1, length);
                result = newarr;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] ss = {1,9,9};
        plusOne(ss);
    }
}