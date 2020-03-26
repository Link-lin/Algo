public class HouseRobberII {

    public int robs(int[] nums, int l, int r) {
        int fITrue = 0, fIFalse = 0, temp;
        for (int i = l; i <= r; i++) {
            temp = Math.max(fITrue, fIFalse);
            fITrue = fIFalse + nums[i];
            fIFalse = temp;
        }
        return Math.max(fITrue, fIFalse);
    }

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return Math.max(robs(nums, 1, nums.length - 1), robs(nums, 0, nums.length - 2));
    }

    public static void main(String[] args) {

    }
}