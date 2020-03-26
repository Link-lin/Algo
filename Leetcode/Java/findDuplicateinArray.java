import java.util.*;

/**
 * findDuplicateinArray
 */
public class findDuplicateinArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                list.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return list;
    }

    public static void main(String[] args) {
        
    }
}