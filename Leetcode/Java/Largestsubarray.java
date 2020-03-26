import java.lang.Math;
class Largestsubarray{

    public static int maxSubArray(int[] nums) {
        int max_sf = 0;
        int max_end = 0;
        int local_max = nums[0];
        if(nums.length ==1 ){
            return nums[0];
        }
        for(int i =0; i < nums.length; i++){
            max_end = max_end + nums[i];
            if(max_end < 0){
                max_end = 0;
            }
            if(max_end > max_sf){
                max_sf = max_end; 
            }
            if(nums[i] > local_max) local_max = nums[i];
        }
        if(local_max <0) return local_max;
        return max_sf;
    }
    
    public static int maxSubArray2(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        return helper(nums, nums.length-1);
    }
    
    static int maxsa =-1000; // negative infinite

    public static int helper(int[] nums, int index){
        if(index < 0){
            return 0;
        }

        int include = helper(nums, index-1) + nums[index];  // Include the current number
        int exclude = nums[index]; // Start a new sequence

        if(include > maxsa) maxsa = include; // Update max sub array 
        if(exclude > maxsa) maxsa = exclude;

        return Math.max(include, exclude);
    }
    public static void main(String[] args){
        int[] arr = {-1};
        System.out.println(maxSubArray2(arr));
        System.out.print(maxsa);
    }
}