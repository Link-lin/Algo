public class rotateArray{

    public static void rotate1(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i = k; i < nums.length; i++){
            arr[i] = nums[i-k];
        }
        int s = 0;
        for(int i = nums.length -k; i< nums.length; i++){
            arr[s++] = nums[i];
        }
        
        for(int i =0; i <arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }

    public static void rotate2(int[] nums, int k){
            //AB -> BA   (A^B^)^ = BA 
            k = k % nums.length;
            int bI = nums.length - k;
            reverse(nums, 0, bI - 1);
            reverse(nums, bI, nums.length - 1);
            reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int t = nums[start];
            nums[start] = nums[end];
            nums[end] = t;
            ++start; --end;
        }
    }

    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7};
        rotate1(arr, 4); 
    }

}