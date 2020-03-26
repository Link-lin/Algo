public class isBalanced{

    public boolean isBalance(TreeNode root){
        if(root == null){
            return true;
        }
        return (Math.abs(maxDep(root.left) - maxDep(root.right)) <=1) && isBalance(root.left) && isBalance(root.right);
    }

    public static int maxDep(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right== null){
            return 1;
        }
        return Math.max(maxDep(root.left)+1, maxDep(root.right)+1); 
    }
    public static void main(String[] args){

    }
}