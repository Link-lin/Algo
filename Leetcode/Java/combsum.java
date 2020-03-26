import java.util.*;

public class combsum{

    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target){
        if (candidates == null || candidates.length == 0)
            return new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        helper(list, candidates, target, 0);
        return result;
    }

    public void helper(List<Integer> list, int[] candidates, int remain, int index){
        // When the target met return and add to list
        if(remain == 0){
            result.add(new ArrayList<>(list));
            Iterator<Integer> itr = list.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next());
            }
            System.out.println();
        }else if(remain >0){
            // Backtracking every solution
            for(int i = index; i<candidates.length; i++){
                list.add(candidates[i]);
                helper(list, candidates, remain-candidates[i], i);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int[] s={1,2,3,4};
        combsum x = new combsum();
        List<List<Integer>> re = x.combinationSum(s, 7);
        Iterator<List<Integer>> itr = re.iterator();
        while(itr.hasNext()){
            Iterator<Integer> itrr = itr.next().iterator();
            while(itrr.hasNext()){
                System.out.print(itrr.next());
            }
            System.out.println();
        }
    }
}