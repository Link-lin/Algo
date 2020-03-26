import java.util.*;

public class BFS{

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        helper(result, root, 0); 
        return result;
    }

    public void helper(List<List<Integer>> list, TreeNode root, int level){
        if (root == null) return;
        if(level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        helper(list, root.left, level+1);
        helper(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }

    // Standard BFS
    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
          List<List<Integer>> resultList = new ArrayList<List<Integer>>();
          if (root == null) return resultList;
          Queue<TreeNode> queue = new LinkedList<TreeNode>();
          queue.add(root);
          int levelSize = 0;
          TreeNode tempNode;
          while(!queue.isEmpty()) {
              levelSize = queue.size();
              List<Integer> tempList = new ArrayList<>();
              for (int i = 0; i < levelSize; i++) {
                  tempNode = queue.poll();
                  tempList.add(tempNode.val);
                    System.out.println(tempNode.val);
                  if (tempNode.left != null) queue.add(tempNode.left);
                  if (tempNode.right != null) queue.add(tempNode.right);
              }
              resultList.add(0, tempList);
          }
          return resultList;
    }

    public static void main(String[] args){

    }
}