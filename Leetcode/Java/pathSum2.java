import java.util.*;

public class pathSum2{
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        path(list, curr, root, sum);
        return list;
    }

    public void path(List<List<Integer>> list,List<Integer> curr, TreeNode node, int target){
        if(node == null) return;
        int rest = target - node.val;
        curr.add(node.val);
        if(node.left == null && node.right ==null && rest ==0){
            list.add(new ArrayList<Integer>(curr));
        }
        else{
            path(list, curr, node.left, rest);
            path(list, curr, node.right, rest);
        }
        curr.remove(curr.size()-1);
    }
    
    public static void main(String[] args){

    }
}