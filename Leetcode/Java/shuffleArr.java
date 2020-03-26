import java.util.*;

public class shuffleArr {
    private int[] origin;
    private int[] nums;
    private Random random;

    public void Solution(int[] nums) {
        this.origin = nums.clone();
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        for(int j = 1; j < nums.length; j++) {
            int i = random.nextInt(j + 1);
            swap(nums, i, j);
        }
        return nums;
    }
    
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}