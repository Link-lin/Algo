import java.util.*;
/**
 * combinationSum2
 */
public class combinationSum2 {

       public List<List<Integer>> combinationSum23(int[] candidates, int t) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates.length == 0 || candidates == null){
            return res;
        }
        Arrays.sort(candidates);
        List<Integer> subset = new ArrayList<>();
        helper(candidates, subset, 0, t, res);
        return res;
    }
    
    private void helper(int[]candidates, 
                        List<Integer> subset, 
                        int startIndex, 
                        int resSum, 
                        List<List<Integer>>res){
        if(resSum == 0){
            res.add(new ArrayList<Integer>(subset));
        }
        
        for(int i = startIndex; i < candidates.length; i++){
            if(candidates[i] > resSum ){
                break;
            }
            // check duplicates
            if(i != startIndex && candidates[i] == candidates[i-1]){
                continue;
            }
            subset.add(candidates[i]);
            helper(candidates, subset, i+1, resSum-candidates[i], res);
            subset.remove(subset.size()-1);
        }        
    }

    public static void main(String[] args) {
        
    }
}