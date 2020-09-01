import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * containDuplicate_217
 */
public class containDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            if (set.contains(x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}