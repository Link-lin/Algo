import java.util.*;

public class find_duplicate{

    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);    
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length -1 && nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args){
        
    }

}