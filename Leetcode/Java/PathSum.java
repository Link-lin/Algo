public class PathSum{
    public boolean hasPathSum(TreeNode root, int sum){
        if(root == null) return false;
        int x = sum -root.val;
        if(root.left == null && root.right==null){           
            return x == 0;
        }
        return hasPathSum(root.left, x)||hasPathSum(root.right, x);
    }
    public static void main(String[] args){

    }
}