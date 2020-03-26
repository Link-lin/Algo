import java.util.*;

public class Permutation{

    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums){
        helper(nums, 0);
        return result;
    }

    public static int[] swap(int[] nums, int i , int k){
        int sw = nums[i];
        nums[i] = nums[k];
        nums[k] = sw;
        return nums;
    }

    public static void helper(int[] nums, int k){
        if(k == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                list.add(nums[j]);
                System.out.print(nums[j]);
            }
            System.out.println();
            result.add(list);
        }
        else{
            for(int i=k; i< nums.length; i++){
                    nums = swap(nums, i, k);
                    helper(nums, k+1);
                    nums = swap(nums, k, i);
            }
        }
    }
    
    public static void main(String[] args){
        int[] s = {1,1,2};
        permute(s);
        
    }
}