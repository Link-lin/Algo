import java.util.*;

/**
 * subset2
 */
public class subset2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<Integer>());

        int size = 0, startIndex;
        for (int i = 0; i < nums.length; i++) {
            startIndex = (i >= 1 && nums[i] == nums[i - 1]) ? size : 0;
            size = ret.size();
            for (int j = startIndex; j < size; j++) {
                List<Integer> temp = new ArrayList<>(ret.get(j));
                temp.add(nums[i]);
                ret.add(temp);
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}