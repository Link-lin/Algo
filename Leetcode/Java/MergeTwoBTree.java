

public class MergeTwoBTree{

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 ==null && t2 == null){
            return null;
        }
        TreeNode root = new TreeNode(0);
        merge(root, t1, t2);
        return root;
    }

    public void merge(TreeNode re, TreeNode t1, TreeNode t2){
        if(t1 != null && t2 != null){
            re.val = t1.val + t2.val;
        }
        else if(t1 != null){
            re.val = t1.val;
        }
        else if(t2 != null){
            re.val = t2.val;
        }

        if((t1 != null && t1.left != null) ||(t2 != null && t2.left !=null)){
            re.left = new TreeNode(0);
            merge(re.left, (t1==null)? null:t1.left, (t2 ==null)? null:t2.left);
        }

        if((t1 != null && t1.right != null) ||(t2 != null && t2.right !=null)){
            re.right = new TreeNode(0);
            merge(re.right, (t1==null)? null:t1.right, (t2 ==null)? null:t2.right);
        }
    }

    public static void main(String[] args){

    }
}