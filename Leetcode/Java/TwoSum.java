class TwoSum{
    public int[] twoSum(int[] nums, int target){
        for(int i =0; i < nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException();
    }
     
    public static void main(String[] args){
        int[] x= {2,7,11,15};
        TwoSum t = new TwoSum();
        int[] test = t.twoSum(x, 9);
        for(int element :test){
            System.out.print(element);
        }
    }
}