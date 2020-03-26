
public class MinimumDep{
    // same as 0 ms solution but running 1ms
    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left != null && root.right == null){
            return minDepth(root.left)+1;
        }
        if(root.left == null && root.right != null){
            return minDepth(root.right)+1;
        }
        return Math.min(minDepth(root.left)+1, minDepth(root.right)+1); 
    }
    
    public static void main(String[] args){

    }

}