public class searchInRotateArr{

    static int result = -1;
    public static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        searchHelp(nums, 0, nums.length-1, target);
        return result;
    }

    public static void searchHelp(int[] nums, int left, int right, int target){
        int mid = (left + right)/2;
        System.out.println(mid);
        if(nums[mid] == target) 
        {
            result = mid;
            return;
        }
        if(left ==right || left < 0 || right <0 || mid==0) return;
        if(target < nums[mid] && target <= nums[nums.length-1]){
            // Right of mid
            searchHelp(nums, mid, right-1, target);
        }
        else if (mid != 0 && target < nums[mid] && nums[mid-1] < nums[mid]){
            searchHelp(nums, 0, mid, target);
        }
        else if(target > nums[mid]){
            // Right of mid
            searchHelp(nums, mid, right-1, target);
        }
    }
    public static void main(String[] args){
        int[] a ={4,5,6,7,0,1,2};
        int res = search(a, 3);
        System.out.print(res);
    }
}