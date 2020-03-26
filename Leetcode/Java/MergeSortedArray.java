public class MergeSortedArray{
    public static void  merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int i =0;
        int j =0;
        while(i < m || j < n){
            if(i == m) {
                nums3[i+j] = nums2[j];
                j++;
                continue;
            }
            if(j == n) {
                nums3[i+j] = nums1[i];
                i++;
                continue;
            }

            if(nums1[i] < nums2[j]){
                nums3[i+j] = nums1[i];
                i++;
            }
            else{
                nums3[i+j] = nums2[j];
                j++;
            }
        }
       System.arraycopy(nums3, 0, nums1, 0, nums3.length);
    }


    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}