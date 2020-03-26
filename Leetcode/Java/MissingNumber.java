public class MissingNumber{

    public int missingNumber(int[] nums) {
        if(nums.length == 1){
            if(nums[0] == 1) return 0;
            if(nums[0] == 0) return 1;
        }
        int max = 0;
        int actual = 0;
        for(int i = 0; i < nums.length; i++){
            actual += nums[i];
            if(nums[i]> max) max = nums[i];
        }
        int expected;
        if(max == nums.length){
            expected = ((1+max)*nums.length)/2;
        }
        else{
            expected = actual+ nums.length;
        }
        
        System.out.println("max:" + max + "expected:" +expected + "actual:" + actual);
        return expected-actual;
    }

    public int missing(int[] nums){
        int n = nums.length;
        int expected = (n*(n+1))/2;
        int actual = 0;

        for(int i :  nums){
            actual += i;
        }

        return expected- actual;
    }

    public static void main(String[] args){

    }
}