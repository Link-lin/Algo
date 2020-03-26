

public class FindMediumSortedArr{

    public int FindMin(int[] nums){
        for(int i =0; i < nums.length -1; i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[0];
    }

    public int FindMin2(int[] nums){
        int left =0, right = nums.length-1;
        int mid;
       

        while(left < right){ 
            mid = (left + right)/2;
            
            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }

    public static void main(String[] args){

    }

}