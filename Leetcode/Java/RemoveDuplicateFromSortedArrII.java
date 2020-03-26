public class RemoveDuplicateFromSortedArrII {

    public int removeDuplicates(int[] nums) {
        int insert = 1, check = 1;
        int cnt = 1;
        int totLen = 1;
        for (int i = 1; i < nums.length; i++) {
            cnt++;
            if (nums[check] != nums[check - 1]) {
                cnt = 1;
            }
            if (cnt <= 2) {
                nums[insert++] = nums[check];
                totLen += 1;
            }
            check += 1;
        }
        return totLen;
    }

    public static void main(String[] args) {

    }
}