import java.util.*;

public class TwoSum_1{

    public static int[] twoSum(int[] nums, int target) {
        // Sort array
        Arrays.sort(nums);   
        int lefti = 0;
        int righti = nums.length -1;

        while(lefti < righti){
            int numl = nums[lefti];
            int numr = nums[righti];
            if(numl + numr == target) break; 
            else if(numl + numr < target) lefti ++; 
            else righti --;
        }

        int [] re = {lefti, righti};
        return re;
    }

    public static int[] twoSum2(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i < nums.length; i ++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String args[]) {
        int [] nums = {2,3,4}; 
        System.out.println(twoSum(nums, 6));
    }
}