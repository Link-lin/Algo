public class insertToBST {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return null;
        TreeNode temp = root;
        while (true) {
            if (val > temp.val) {
                if (temp.right != null) {
                    temp = temp.right;
                    continue;
                } else {
                    temp.right = new TreeNode(val);
                    break;
                }
            } else if (val < temp.val) {
                if (temp.left != null) {
                    temp = temp.left;
                    continue;
                }
                else{
                    temp.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}