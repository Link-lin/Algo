public class jumpGame {

    public static boolean canJump(int[] nums) {
        if (nums.length == 0)
            return false;
        boolean[] can = new boolean[nums.length];
        can[0] = true;
        A: for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]; j > 0; j--) {
                if (i + j < nums.length && can[i] == true) {
                    can[i + j] = true;
                    continue A;
                }
            }
        }

        for (int i = 0; i < can.length; i++) {
            System.out.print(can[i] + ",");
        }
        return can[nums.length - 1];
    }

    // In fact a greedy problem
    public static boolean canJump2(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reachable)
                return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 1, 4 };
        boolean s = canJump(a);
        System.out.print(s);

    }
}