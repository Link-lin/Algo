public class maxProduct3{

    public int maximumProduct(int[] nums) {
        int fst_neg = 0, snd_neg = 0;        
        int large1 =-1001;
        int large2 =-1001;
        int large3 =-1001;

        for(int i = 0; i < nums.length; i++){
            // when the current number is the greatest 
            if(nums[i]> large3){
                large1 = large2;
                large2 = large3;
                large3 = nums[i];
            }
            else if (nums[i] > large2){
                large1 = large2;
                large2 = nums[i];
            }
            else if (nums[i] > large1){
                large1 = nums[i];
            }

            if(nums[i]< fst_neg && nums[i] < 0){
                snd_neg = fst_neg;
                fst_neg = nums[i];
            }
            else if (nums[i] < snd_neg){
                snd_neg = nums[i];
            }

        }
        System.out.println("large 1,2,3: " + large1 + "," + large2 + "," + large3);

        if(fst_neg*snd_neg*large3 < large1*large2*large3) return large1*large2*large3;
        return fst_neg*snd_neg*large3;
    }
    public static void main(String[] args){

    }
}