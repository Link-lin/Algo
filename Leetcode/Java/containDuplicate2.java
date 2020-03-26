/**
 * containDuplicate2
 */
public class containDuplicate2 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j <=k ; j++){
                if(i+j >= nums.length){
                    continue;
                }
                else{
                    if(nums[i] == nums[i+j]){
                        return true;
                    } 
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        if(nums.length==0)
             return false;
         if(nums.length>5000)
             return false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]==nums[j])
                    {
                        if(Math.abs(j-i)<=k)
                            return true;
                    }
                }
            }
        }
        return false;
    }

    

    public static void main(String[] args) {
        
    } 
}