import java.util.*;

class binaryTreePath257{

    List<String> re = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        binaryTreePathHelper(root, "");
        return re;
    }

    public void binaryTreePathHelper(TreeNode node, String cur){
        if(node.left != null){
            binaryTreePathHelper(node.left, cur + String.valueOf(node.val) + "->");
        }

        if(node.right !=null){
            binaryTreePathHelper(node.right, cur + String.valueOf(node.val) + "->");
        }

        cur.concat(String.valueOf(node.val));
        re.add(cur);
    }

    public static void main(String[] args){

    }
}