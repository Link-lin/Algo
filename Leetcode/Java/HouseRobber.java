import java.util.*;

public class HouseRobber {

    public static int rob(int[] nums) {
        int fITrue = 0, fIFalse = 0, temp;
        for (int i = 0; i < nums.length; i++) {
            temp = Math.max(fITrue, fIFalse);
            fITrue = fIFalse + nums[i];
            fIFalse = temp;
        }
        return Math.max(fITrue, fIFalse);
    }

    public static int helper(int[] nums) {
        int max;
        int[] arr;
        if (nums.length >= 2) {
            if (nums[0] < nums[1]) {
                max = nums[1];
                arr = Arrays.copyOfRange(nums, 3, nums.length - 1);
            } else {
                max = nums[0];
                arr = Arrays.copyOfRange(nums, 2, nums.length - 1);
            }
            return helper(arr) + max;
        } else {
            return (nums.length == 1) ? nums[0] : 0;
        }

    }

    public static void main(String[] args) {

    }
}