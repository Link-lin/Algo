public class SymmetricTree{
    private boolean isSymm(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left !=null && right == null){
            return false;
        }
        if(left ==null && right != null){
            return false;
        }
        if(left.val == right.val){
            return isSymm(left.left, right.right)&&isSymm(left.right, right.left);
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        return isSymm(root.left, root.right);
    }


    public static void main(String[] args){

    }
}