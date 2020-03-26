/**
 * LSAofBST
 */
public class LSAofBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int left , right;
        if(p.val < q.val){
            left = p.val;
            right = q.val;
        }
        else{
            left = q.val;
            right = p.val;
        }
        TreeNode temp = root;
        while(true){
            if(temp.val <= right && temp.val >= left){
                return new TreeNode(temp.val);
            }
            else if(temp.val < right && temp.val < left){
                temp = temp.right;
            }
            else if(temp.val > right && temp.val > left){
                temp = temp.left;
            }
        }
       
    }

    public static void main(String[] args) {

    }
}