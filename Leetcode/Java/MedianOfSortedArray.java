class MedianOfSortedArray{

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){        
        int[] merged = new int[nums1.length + nums2.length];
        double median;
        // Merge two arrays
        int i = 0, j =0;
        int k = 0;
        while(i < nums1.length || j < nums2.length){
            if(i >= nums1.length){
                merged[k++] = nums2[j++];
                continue;
            } 
            if(j >= nums2.length){
                merged[k++] = nums1[i++];
                continue;
            }

            if(nums1[i] < nums2[j]){
                merged[k++] = nums1[i++];
                continue;
            }
            else{
                merged[k++] = nums2[j++];
                continue;
            }
        }

        for(int m = 0; m < merged.length; m++){
            System.out.print(merged[m] + ",");
        }
        System.out.println();

        if(merged.length%2 == 0){
            int s = merged.length/2;
            median = (merged[s] + merged[s-1]);
            median /=2;
        }
        else{
            median = merged[merged.length/2];
        }
        return median;
    }

    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double re = findMedianSortedArrays(nums1, nums2);
        System.out.print(re);

    }
}