public class sumLeftLeave{

    public int count = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        isLeftleaf(root);
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right); 
        return count;
    }

    public void isLeftleaf(TreeNode node){
        if(node.left != null){
            if(node.left.left == null && node.left.right==null){
                count ++;
            }
        }
    }

    public static void main(String[] args){

    }
}