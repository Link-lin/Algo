import java.util.*;

public class singleNum{

    // 6ms solution
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i =0; i< nums.length; i++){
            if(i == nums.length-1){
                result = nums[i];
                break;
            }
            if(nums[i] == nums[i+1]){
                i++;
            }
            else{
                result = nums[i];
                break;
            }
        }
        return result;
    }

    // 1ms solution
    public static int singleNumber2(int[] nums){
        int result = 0;
        for(int i =0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    } 

    public static void main(String[] args){
        int[] s = {2,2,1};
        System.out.print( singleNumber2(s));
    }
}