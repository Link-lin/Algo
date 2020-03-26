

public class maxDepth{
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