/**
 * thirdMaxNumber
 */
public class thirdMaxNumber {

    public static int thirdMax(int[] nums) {
        long fstMax, sndMax, thdMax;
        fstMax = sndMax = thdMax = Long.MIN_VALUE;
        for(int i =0; i < nums.length; i++){
            if(nums[i]> fstMax){
                thdMax = sndMax;
                sndMax = fstMax;
                fstMax = nums[i];
            }
            else if(nums[i] > sndMax && nums[i]!=fstMax){
                thdMax = sndMax;
                sndMax = nums[i];
            }
            else if(nums[i] > thdMax && nums[i]!=sndMax && nums[i]!=fstMax){
                thdMax = nums[i];
            }
        }
        System.out.print(fstMax + ", " + sndMax + "," + thdMax);
        if(thdMax == Long.MIN_VALUE){
            return (int)fstMax;
        }
        return (int)thdMax;
    }

    public static void main(String[] args) {
        int[]  arr = {2,2,3,1};
        thirdMax(arr);
    }
}