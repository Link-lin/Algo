public class univalueBTree{

    private static int val = 0;
    public static boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return helper(root);
    }

    public static boolean helper(TreeNode root){
        if(root.val != val) return false;
        return helper(root.left) && helper(root.right);
    }

    public static void main(String[] args) {
        
    }
}