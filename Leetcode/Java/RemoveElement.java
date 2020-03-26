import java.util.Arrays;;
class RemoveElement{

    public static int RemoveElements(int[] nums, int val){
        Arrays.sort(nums);
        int pos = 0;
        /*
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] == cur){
                continue;
            }
            else{
                nums[pos+1] = nums[i];
                pos ++;
                cur = nums[i];
            }
        }
        */

        for(int i =0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                nums[pos] = nums[i];
                pos ++;
            }
        }

        for(int i =0; i < nums.length-1; i ++){
            System.out.print(nums[i] + ",");
        }
        System.out.print("\n" + pos);

        return pos;
    }

    public static void main(String[] args){

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        RemoveElements(nums, val);
    }
}