class ThreeSum{

    public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

    /*
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);//sorting array  
        int length = nums.length;  
        length = removeDuplicateElements(nums, length); 

        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                for(int k = 0; k < length; k++){
                    if(nums[i]+ nums[j] + nums[k] == 0){
                        res.add(Arrays.asList(nums[i], nums[j], nums[k])); 
                    }
                }
            }
        }
        return res;
    }
    */

    public static void main(String[] args){

    }
}