/**
 * singleEleinSortedArray
 */
public class singleEleinSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        return singleHelper(left, right, nums);
    }

    public static int singleHelper(int left, int right, int[] nums) {
        int mid = (left + right) / 2;
        System.out.println("right: " + right + ", left: " + left);
        if (right - left == 2) {
            if (right == left)
                return nums[right];
            if (nums[mid] == nums[mid - 1]) {
                return nums[mid + 1];
            }
            return nums[mid - 1];
        }

        boolean odd = mid % 2 == 1;
        if (nums[mid] == nums[mid - 1]) {
            return odd ? singleHelper(mid + 1, right, nums) : singleHelper(left, mid - 2, nums);
        } else if (nums[mid] == nums[mid + 1]) {
            return odd ? singleHelper(left, mid - 1, nums) : singleHelper(mid + 2, right, nums);
        } else {
            return nums[mid];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 2, 5, 5 };
        int s = singleNonDuplicate(arr);
        System.out.println(s);
    }
}