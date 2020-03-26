import java.util.*;

public class nextPermutation31{

    public static void nextPermutation(int[] nums) {
        int[] arr = nums.clone();    
        Arrays.sort(arr);
        if(reverseEqual(arr, nums)){
            nums = arr;
            return;
        }

        for(int i = nums.length; i > 0; i --){
            if(nums[i] > nums[i-1]){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                break;
            }
        }

    }

    public static boolean reverseEqual(int[] a, int[] b){
        for(int i =0; i < a.length; i++){
            if(b[b.length-1-i] != a[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

    }
}