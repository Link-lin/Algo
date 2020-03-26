import java.util.*;

public class UniquePermutation{

    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums){
        helper(nums, 0);
        return result;
    }

    public static int[] swap(int[] nums, int i , int k){
        int sw = nums[i];
        nums[i] = nums[k];
        nums[k] = sw;
        return nums;
    }

    public static void helper(int[] nums, int k){
        if(k == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                list.add(nums[j]);
                System.out.print(nums[j]);
            }
            System.out.println();
            result.add(list);
        }
        else{
            Set<Integer> appeared = new HashSet<>();
            for(int i=k; i< nums.length; i++){
                if(appeared.add(nums[i])){
                    nums = swap(nums, i, k);
                    helper(nums, k+1);
                    nums = swap(nums, k, i);
                }
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> collector = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(collector, nums, new ArrayList<>(), new boolean[nums.length]);
        return collector;
    }
    
    private void backtrack(List<List<Integer>> collector, int[] nums, List<Integer> current, boolean[] used) {
        if (current.size() == nums.length) {
            collector.add(new ArrayList<>(current));
            return;
        }
        
        // Loop n round. For each round, pick a non-used element.
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            // If an element is the same as previous one, if the previous one is not used, skip it.
            // Otherwise, it will create a duplicate
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            current.add(nums[i]);
            used[i] = true;
            backtrack(collector, nums, current, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
        
    }

    public static void main(String[] args){
    }
}