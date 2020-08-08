public class ValidateBSTree {

    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBST(TreeNode root, long minVal, long maxVal){
        if (root == null)
            return true;
        if (root.val <= minVal || root.val >= maxVal)
            return false;
        return checkBST(root.left, minVal, root.val) && checkBST(root.right, root.val, maxVal);
    }
    public static void main(String[] args) {
    }
}