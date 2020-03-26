import java.util.*;

public class ThreeSumClose{

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = 999;
        for (int i = 0; i + 2 < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) { // skip same result
                continue;
            }
            int j = i + 1, k = nums.length - 1;
            
            while (j < k) {
                int sum = nums[i] +nums[j]+nums[k];
                System.out.println(nums[i] + "+" + nums[j] + "+" + nums[k] +"="+ sum);
                if(sum > target){
                    k--;
                }else{
                    j++;
                }
                
                if(Math.abs(sum-target) < Math.abs(close-target)){
                    close = sum;
                }
            }
        }
        return close;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4,6,7};
        int target = 3;
        threeSumClosest(nums, target);
    }
}